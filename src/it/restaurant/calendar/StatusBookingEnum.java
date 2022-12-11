package it.restaurant.calendar;

public enum StatusBookingEnum {
    SUCCESS,
    NOT_SUCCESS;

    private StatusInfoEnum info;


    private StatusBookingEnum () {
        this.info = StatusInfoEnum.NO_INFO;
    }

    public StatusInfoEnum getInfo() {
        return info;
    }

    public void setInfo(StatusInfoEnum info) {
        this.info = info;
    }

    public StatusBookingEnum setInfoAndGetStatus (StatusInfoEnum info) {
        this.info = info;
        return this;
    }




}
