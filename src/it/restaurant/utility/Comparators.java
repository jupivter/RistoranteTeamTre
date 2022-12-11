package it.restaurant.utility;

import it.restaurant.calendar.Booking;

import java.util.Comparator;

public class Comparators  {

    private static Comparator<Booking> compareBookingsByDay;

    private Comparators() {
        this.compareBookingsByDay = (b1, b2) -> {
            if(b1.getTime().isBefore(b2.getTime())) return -1;
            else if(b1.getTime().isAfter(b2.getTime())) return +1;
            else return 0;
        };
    }

    public static Comparator<Booking> getCompareBookingsByDay () {
        return compareBookingsByDay;
    }



}
