package it.restaurant.calendar;

import it.restaurant.Ristorante;
import it.restaurant.utility.Comparators;
import it.restaurant.prenotazione.Cliente;
import it.restaurant.prenotazione.Tavolo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class CalendarBookings {

    private TreeMap<LocalDate, TreeSet<Booking>> bookingsMap;

    private Ristorante restaurant;

    private static CalendarBookings calendarBookings = new CalendarBookings();

    private long minRangeBetweenBookings;

    private CalendarBookings () {
        this.bookingsMap = new TreeMap<>();
        this.minRangeBetweenBookings = 60;
        this.restaurant = new Ristorante("Il ghiottone", "Via Indipendenza", "3453678987", "ilghiottone@hotmail.com");
        this.restaurant.setTavoli(new HashMap<>() {{
            put(1, new Tavolo(5, 1, true));
            put(2, new Tavolo(4, 2, true));
            put(3, new Tavolo(2, 3, true));
            put(4, new Tavolo(3, 4, true));
            put(5, new Tavolo(3, 5, true));
            put(6, new Tavolo(7, 6, true));
        }});
    }

    public static CalendarBookings getInstance ( ) {return calendarBookings;}

    public long getMinRangeBetweenBookings() {
        return minRangeBetweenBookings;
    }

    public void setMinRangeBetweenBookings(int minRangeBetweenBookings) {
        this.minRangeBetweenBookings = minRangeBetweenBookings;
    }

    // METODO PER ATTIVARE UN INTERVALLO DI GIORNI

    public void activateIntervalFromDate (LocalDate startDate, int numberOfDays) {
        for(int i=0; i<numberOfDays; i++) {
            LocalDate nextDay = startDate.plusDays(i);
            if(bookingsMap.keySet().contains(nextDay)) continue;
            bookingsMap.put(nextDay,new TreeSet<>(Comparators.getCompareBookingsByDay()));
        }
    }

    private boolean checkDateInCalendar (LocalDate date) {
        return date.isBefore(bookingsMap.firstKey()) || date.isAfter(bookingsMap.lastKey()) ?  false : true;
    }

    //METODO PER AGGIUNGERE PRENOTAZIONI

    private StatusBookingEnum addBooking (List<Cliente> clientsList, LocalDate date, LocalTime time, long rangeTime, Tavolo table) {
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        if(!checkDateInCalendar(date)) return StatusBookingEnum.NOT_SUCCESS.setInfoAndGetStatus(StatusInfoEnum.DATE_OUT_OF_CALENDAR);
        bookingsMap.get(date).add(new Booking(clientsList,dateTime,rangeTime,table));
        return StatusBookingEnum.SUCCESS;
    }



    // METODO PER PRENOTARE

    public synchronized StatusBookingEnum bookTable (List<Cliente> clientsList, LocalDate date, LocalTime time, long rangeTime) {
        if(rangeTime<minRangeBetweenBookings) rangeTime = minRangeBetweenBookings;
        int peopleNumber = clientsList.size();
        Set<Tavolo> overlappingTables = getTablesOverlappingTime(date,time,rangeTime);
        TreeSet<Tavolo> freeTables = restaurant.getFreeTableFromTakenTables(overlappingTables,peopleNumber);
        if(freeTables.isEmpty()) return StatusBookingEnum.NOT_SUCCESS.setInfoAndGetStatus(StatusInfoEnum.NO_FREE_TABLES);
        return addBooking(clientsList,date,time,rangeTime,freeTables.first());
    }

    public synchronized StatusBookingEnum bookTableWithMinRange (List<Cliente> clientsList, LocalDate date, LocalTime time) {
        return bookTable(clientsList,date,time,minRangeBetweenBookings);
    }

    private Set<Tavolo> getTablesOverlappingTime (LocalDate date, LocalTime time, long rangeTime){
        return getBookingsOverlappingTime(date,time,rangeTime).stream().map(Booking::getTable).collect(Collectors.toSet());
    }


    private TreeSet<Booking> getBookingsOverlappingTime (LocalDate date, LocalTime time, long rangeTime){
        TreeSet <Booking> overlappingBookings = new TreeSet<>(Comparators.getCompareBookingsByDay());
        TreeSet <Booking> dayBookingsSet = bookingsMap.get(date);
        TreeSet <LocalTime> dayBookingsTimesSet = new TreeSet<>(dayBookingsSet.stream().map(booking -> booking.getTime()).collect(Collectors.toSet()));
        long distanceTime = 0;
        LocalTime nextTime = time;
        while(distanceTime < rangeTime){
            nextTime = dayBookingsTimesSet.higher(nextTime);
            if(nextTime == null) break;
            distanceTime = Math.abs(ChronoUnit.MINUTES.between(time,nextTime));
            if(distanceTime < rangeTime) overlappingBookings.add(dayBookingsSet.get(nextTime));
        }
        LocalTime previusTime = time;
        while(previusTime!=null){
            previusTime = dayBookingsMap.lowerKey(previusTime);
            if(previusTime == null) break;
            distanceTime = Math.abs(ChronoUnit.MINUTES.between(time,previusTime));
            Booking booking = dayBookingsMap.get(previusTime);
            if(distanceTime < dayBookingsMap.get(previusTime).getRangeTime()) overlappingBookings.add(dayBookingsMap.get(previusTime));
        }
        return overlappingBookings;
    }


    public String getDetails () {
        String str = "";
        for(LocalDate date : bookingsMap.keySet()){
            str += "\nBookings of " +  date + " : \n" ;
            if(bookingsMap.get(date).isEmpty())
                str += " No bookings for this date\n";
            else
                for(Booking booking : bookingsMap.get(date).values())
                    str += booking.getDetails() .indent(-1)+ "\n";
            str += "--------------------\n";
        }
        return str;
    }

    public void printDetails () {
        System.out.println(this.getDetails());
    }
}
