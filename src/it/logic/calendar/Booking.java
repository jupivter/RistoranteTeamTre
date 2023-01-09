package it.logic.calendar;

import it.logic.prenotazione.Client;
import it.logic.restaurant.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Booking {

    private List<Client> clientsList;

    private LocalDateTime dateTime;

    private Table table;

    private long rangeTime;

    public Booking (List<Client> clientsList, LocalDateTime dateTime, long rangeTime, Table table){
        this.clientsList = clientsList;
        this.dateTime = dateTime;
        this.table = table;
        this.rangeTime = rangeTime;
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public LocalTime getTime () {
        return this.dateTime.toLocalTime();
    }

    public LocalDate getDate () {
        return this.dateTime.toLocalDate();
    }

    public long getRangeTime() {
        return rangeTime;
    }

    public void setRangeTime(long rangeTime) {
        this.rangeTime = rangeTime;
    }

    public String getDetails () {
        return  "Booking details: " +
                "\n DateTime: " + dateTime +
                "\n Range: " +rangeTime +
                "\n People number: " + clientsList.size() +
                "\n Table: " + table.getTableNumber() ;
    }
    /*
    @Override
    public int compareTo(Booking booking) {
        if(this == booking) return 0;
        if(this.getTime().isBefore(booking.getTime())) return -1;
        else  return 1;
    }*/
}
