package it.logic.utility;

import it.logic.calendar.Booking;
import it.logic.restaurant.Table;

import java.util.Comparator;

/**
 * Questa classe serve a creare dei comparatori per le altre classi.
 */
public class Comparators  {

    private Comparators() {}

    private static Comparator<Booking> compareBookingsByDateTime =  (b1, b2) -> {
        if(b1 == b2) return 0;
        if(b1.getDateTime().isBefore(b2.getDateTime())) return -1;
        else return 1;
    };;

    public static Comparator<Booking> getCompareBookingsByDateTime() {
        return compareBookingsByDateTime;
    }

    private static Comparator<Table> compareTablesBySeating = (t1, t2) -> {
        if(t1 == t2) return 0;
        if(t1.getNumberOfSeats() < t2.getNumberOfSeats()) return -1;
        else return 1;
    };

    public static Comparator<Table> getCompareTablesBySeating () {
        return compareTablesBySeating;
    }

}