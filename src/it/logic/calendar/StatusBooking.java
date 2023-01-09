package it.logic.calendar;

import java.util.Optional;

public class StatusBooking {

    boolean success;

    private InfoBookingEnum info;

    private Optional<Booking> succesfulBooking;


    public StatusBooking(boolean success,InfoBookingEnum info) {
        this.success = success;
        this.info = info;
        this.succesfulBooking = Optional.empty();
    }

    public StatusBooking(boolean success, InfoBookingEnum info,Booking booking){
        this.success = success;
        this.info = info;
        this.succesfulBooking = Optional.of(booking);
    }

    public InfoBookingEnum getInfo() {
        return info;
    }

    public boolean isSuccess() {
        return success;
    }

    public Booking getSuccesfulBooking() {
        return succesfulBooking.get();
    }


}
