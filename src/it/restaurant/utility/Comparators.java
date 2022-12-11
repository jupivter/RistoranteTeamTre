package it.restaurant.utility;

import it.restaurant.calendar.Booking;
import it.restaurant.prenotazione.Tavolo;

import java.util.Comparator;

public class Comparators  {

    private Comparators() {}

    private static Comparator<Booking> compareBookingsByDay =  (b1, b2) -> {
        if(b1 == b2) return 0;
        if(b1.getTime().isBefore(b2.getTime())) return -1;
        else return 1;
    };;


    public static Comparator<Booking> getCompareBookingsByDay () {
        return compareBookingsByDay;
    }


    private static Comparator<Tavolo> compareTablesBySeating = (t1, t2) -> {
        if(t1 == t2) return 0;
        if(t1.getNumeroPostiTavolo() < t2.getNumeroPostiTavolo()) return -1;
        else return 1;
    };

    public static Comparator<Tavolo> getCompareTablesBySeating () {
        return compareTablesBySeating;
    }


}
