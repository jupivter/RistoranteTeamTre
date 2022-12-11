package it.restaurant.calendar;

public enum StatusBookingEnum {
    SUCCESS,
    NOT_SUCCESS;

    private StatusBookingInfoEnum info;


    private StatusBookingEnum () {
        this.info = StatusBookingInfoEnum.NO_INFO;
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




}
