package it.restaurant.utility;

import it.restaurant.calendar.Booking;

import java.util.Comparator;

public class Comparators  {

    private static Comparator<Booking> compareBookingsByDay;

    private Comparators() {
        this.compareBookingsByDay = (b1, b2) -> {
            if(b1 == b2) return 0;
            if(b1.getTime().isBefore(b2.getTime())) return -1;
            else  return 1;
        };
    }

    public static Comparator<Booking> getCompareBookingsByDay () {
        return compareBookingsByDay;
    }



}
