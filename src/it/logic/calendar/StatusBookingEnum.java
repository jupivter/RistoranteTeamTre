package it.logic.calendar;

public enum StatusBookingEnum {
    SUCCESS,
    NOT_SUCCESS;

    private StatusBookingInfoEnum info;

    private Booking successfulBooking;


    private StatusBookingEnum () {
        this.info = StatusBookingInfoEnum.NO_INFO;
        this.successfulBooking = null;
    }

    public StatusBookingInfoEnum getInfo() {
        return info;
    }

    public void setInfo(StatusBookingInfoEnum info) {
        this.info = info;
    }

    public StatusBookingEnum setInfoAndGetStatus (StatusBookingInfoEnum info) {
        this.info = info;
        return this;
    }

    public Booking getSuccessfulBooking() {
        return successfulBooking;
    }

    public void setSuccessfulBooking(Booking successfulBooking) {
        this.successfulBooking = successfulBooking;
    }

    public StatusBookingEnum setBookingAndGetStatus (Booking booking){
        this.successfulBooking = booking;
        return this;
    }
}
