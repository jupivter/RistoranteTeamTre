package it.logic.calendar;

import it.database.Alter;
import it.database.Create;
import it.database.Insert;
import it.logic.restaurant.Restaurant;
import it.logic.restaurant.Table;
import it.logic.utility.Comparators;
import it.logic.prenotazione.Client;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class CalendarBookings {

    private String tableName = "CalendarBookings";

    private TreeMap<LocalDate, TreeSet<Booking>> bookingsMap;

    private final Restaurant restaurant;

    private long minRangeBetweenBookings;

    public CalendarBookings(Restaurant restaurant) {
        this.bookingsMap = new TreeMap<>();
        this.minRangeBetweenBookings = 60;
        this.restaurant = restaurant;
    }

    public long getMinRangeBetweenBookings() {
        return minRangeBetweenBookings;
    }

    public void setMinRangeBetweenBookings(int minRangeBetweenBookings) {
        this.minRangeBetweenBookings = minRangeBetweenBookings;
    }

    /**
     * Questo metodo attiva un intervallo del calendario in cui è possibile accettare prenotazioni.
     * @param startDate data di partenza dell'intervallo.
     * @param numberOfDays numero di giorni da attivare a partire dalla data prescelta.
     */
    public void activateIntervalFromDate (LocalDate startDate, int numberOfDays) {
        for(int i=0; i<numberOfDays; i++) {
            LocalDate nextDay = startDate.plusDays(i);
            if(bookingsMap.containsKey(nextDay)) {continue;}
            bookingsMap.put(nextDay, new TreeSet<>(Comparators.getCompareBookingsByDateTime()));
        }
    }

    /**
     * Questo metodo verifica se una data è al momento attiva.
     * @param date
     * @return true: se la data è attiva | false: se la data non è attiva
     */
    private boolean checkDateInCalendar (LocalDate date) {
        return date.isBefore(bookingsMap.firstKey()) || date.isAfter(bookingsMap.lastKey()) ?  false : true;
    }



    /**
     * Questo metodo controlla che sia stato inserito un range accettabile altrimenti inserisce automaticamente il range minimo;
     * Calcola i tavoli occupati attraverso il metodo {@link it.logic.calendar.CalendarBookings#getTablesOverlappingTime}
     * per impedire ad un altro utente di prenotare,
     * calcola i possibili tavoli liberi attraverso il metodo {@link Restaurant#getFreeTableFromTakenTables},
     * se non ci sono tavoli liberi: la prenotazione non ha successo | se ci sono tavoli liberi: la prenotazione ha successo
     * e viene aggiunta alla bookingsMap.
     * @param clientsList lista di persone legate alla singola prenotazione.
     * @param date data in cui si vuole prenotare.
     * @param time orario in cui si vuole prenotare.
     * @param rangeTime durata della permanenza al tavolo.
     * @return lo stato della prenotazione.
     */
    public synchronized StatusBooking bookTable (List<Client> clientsList, LocalDate date, LocalTime time, long rangeTime) {
        if(!checkDateInCalendar(date)) {return new StatusBooking(false,InfoBookingEnum.DATE_OUT_OF_CALENDAR);}
        if(rangeTime<minRangeBetweenBookings) {rangeTime = minRangeBetweenBookings;}
        int peopleNumber = clientsList.size();
        Set<Table> overlappingTables = getTablesOverlappingTime(date,time,rangeTime);
        TreeSet<Table> freeTables = restaurant.getFreeTableFromTakenTables(overlappingTables,peopleNumber);
        if(freeTables.isEmpty()) {return new StatusBooking(false,InfoBookingEnum.NO_FREE_TABLES);}
        Booking newBooking = new Booking(clientsList,LocalDateTime.of(date,time),rangeTime,freeTables.first());
        bookingsMap.get(date).add(newBooking);
        return new StatusBooking(true,InfoBookingEnum.NO_INFO,newBooking);
    }


    public synchronized StatusBooking bookTableWithMinRange (List<Client> clientsList, LocalDate date, LocalTime time) {
        return bookTable(clientsList,date,time,minRangeBetweenBookings);
    }

    /**
     * Questo metodo restituisce un TreeSet contenente le prenotazioni degli altri utenti che si sovrappongono all'orario
     * in cui si sta cercando di prenotare. Esegue un ciclo sulle prenotazioni gia esistenti e seleziona tutte le prenotazioni esistenti la cui
     * durata si va a sovrapporre alla durata della nuova prenotazione.
     * @param date la data in cui si vuole prenotare.
     * @param time l'orario in cui si vuole prenotare
     * @param rangeTime durata della permanenza al tavolo.
     * @return un TreeSet contenente le prenotazioni degli altri utenti che si sovrappongono all'orario in cui si sta cercando di prenotare.
     */
    private TreeSet<Booking> getBookingsOverlappingTime (LocalDate date, LocalTime time, long rangeTime){
        TreeSet <Booking> overlappingBookings = new TreeSet<>(Comparators.getCompareBookingsByDateTime());
        TreeSet <Booking> dayBookingsSet = bookingsMap.get(date);
        long distanceTime = 0;
        for(Booking booking : dayBookingsSet){
            LocalTime bookingTime = booking.getTime();
            distanceTime = Math.abs(ChronoUnit.MINUTES.between(time,bookingTime));
            if(bookingTime.equals(time)){
                overlappingBookings.add(booking);
            }
            else if(bookingTime.isAfter(time)) {
                if(distanceTime < rangeTime) {overlappingBookings.add(booking);}
            }
            else
            if(distanceTime < booking.getRangeTime()) {overlappingBookings.add(booking);}
        }
        return overlappingBookings;
    }

    /**
     * Questo metodo risale ai tavoli legati alle prenotazioni che si sovrappongono alla nuova prenotazione utilizzando
     * il metodo {@link it.logic.calendar.CalendarBookings#getBookingsOverlappingTime}.
     * @param date la data in cui si vuole prenotare.
     * @param time l'orario in cui si vuole prenotare
     * @param rangeTime durata della permanenza al tavolo.
     * @return i tavoli legati alle prenotazioni che si sovrappongono alla nuova prenotazione.
     */
    private Set<Table> getTablesOverlappingTime (LocalDate date, LocalTime time, long rangeTime){
        return getBookingsOverlappingTime(date,time,rangeTime).stream().map(Booking::getTable).collect(Collectors.toSet());
    }

    public void resetBookingsMap () {
        this.bookingsMap = new TreeMap<>();
    }


    public String getDetailsOfDate (LocalDate date) {
        String str = "";
        str += "\nBookings of " +  date + " : \n" ;
        if(bookingsMap.get(date).isEmpty())
            str += " No bookings for this date\n";
        else
            for(Booking booking : bookingsMap.get(date))
                str += booking.getDetails() .indent(-1)+ "\n";
        return str;
    }

    public String getDetailsBetweenTwoDates (LocalDate startDate, LocalDate endDate) {
        SortedMap <LocalDate,TreeSet<Booking>> subMap =  bookingsMap.subMap(startDate,true,endDate,true);
        String str = "";
        for(LocalDate date : subMap.keySet()){
            str += "\nBookings of " +  date + " : \n" ;
            if(bookingsMap.get(date).isEmpty())
                str += " No bookings for this date\n";
            else
                str += getDetailsOfDate(date);
            str += "--------------------\n";
        }
        return str;
    }

    public String getDetailsFromDate (LocalDate startDate, int numberOfDays) {
        LocalDate endDate = startDate.plusDays(numberOfDays);
        return getDetailsBetweenTwoDates(startDate,endDate);
    }

    public String getDetailsOfAllDays () {
        return getDetailsBetweenTwoDates(bookingsMap.firstKey(),bookingsMap.lastKey());
    }

    public void printDetailsOfDate (LocalDate date) {
        System.out.println(getDetailsOfDate(date));
    }

    public void printDetailsBetweenTwoDates (LocalDate startDate, LocalDate endDate){
        System.out.println(getDetailsBetweenTwoDates(startDate,endDate));
    }

    public void printDetailsFromDate (LocalDate startDate, int numberOfDays){
        System.out.println(getDetailsFromDate(startDate,numberOfDays));
    }

    public void printDetailsOfAllDays ( ) {
        System.out.println(getDetailsOfAllDays());
    }


    public void createTable ( ) throws SQLException {
        Create.createTable(this.tableName, CalBookTableColsEnum.BOOKING_ID.getColName());
        Alter.addNewColumn(this.tableName, CalBookTableColsEnum.TABLE_ID.getColName(), CalBookTableColsEnum.TABLE_ID.getType());
        Alter.addNewColumn(this.tableName, CalBookTableColsEnum.DATE_TIME.getColName(),  CalBookTableColsEnum.DATE_TIME.getType());
        Alter.addNewColumn(this.tableName, CalBookTableColsEnum.RANGE_TIME.getColName(), CalBookTableColsEnum.RANGE_TIME.getType());
    }

    public void insertBookingIntoTable (Booking booking) throws SQLException {
        Insert.insertValuesIntoTable(this.tableName, booking.createMapColumnValue());
    }
}
