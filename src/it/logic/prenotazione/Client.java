package it.logic.prenotazione;

import it.logic.calendar.Booking;
import it.logic.calendar.CalendarBookings;
import it.logic.calendar.StatusBooking;
import it.logic.portate.CategoryEnum;
import it.logic.utility.Comparators;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.TreeSet;

public class Client {

    private String name;
    private String surname;
    private int phoneNumber;
    private CategoryEnum clientCategory;
    private TreeSet<Booking> myBookingsSet;

    public Client(String name, String surname, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.myBookingsSet = new TreeSet<>(Comparators.getCompareBookingsByDateTime());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CategoryEnum getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(CategoryEnum clientCategory) {
        this.clientCategory = clientCategory;
    }

    public String clientInfo(){
        return "Cliente: " + this.name + " - " + this.surname;
    }

    public StatusBooking bookTable(CalendarBookings calendar, List<Client> clientsList, LocalDate date, LocalTime time, long rangeTime) {
        StatusBooking statusBooking =  calendar.bookTable(clientsList,date,time,rangeTime);
        if(statusBooking.isSuccess()){
            myBookingsSet.add(statusBooking.getSuccessfulBooking());
        }
        else{
            // get info e agire di conseguenza
        }
        return statusBooking;
    }

}