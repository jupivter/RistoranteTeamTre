package it.restaurant.calendar;

public enum StatusBookingEnum {
    SUCCESS,
    NOT_SUCCESS;

    private StatusBookingInfoEnum info;

    private Booking succesfulBooking;


    private StatusBookingEnum () {
        this.info = StatusBookingInfoEnum.NO_INFO;
        this.succesfulBooking = null;
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

    public Booking getSuccesfulBooking() {
        return succesfulBooking;
    }

    public void setSuccesfulBooking(Booking succesfulBooking) {
        this.succesfulBooking = succesfulBooking;
    }

    public StatusBookingEnum setBookingAndGetStatus (Booking booking){
        this.succesfulBooking = booking;
        return this;
    }
}
