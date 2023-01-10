package it.logic.calendar;

public enum CalBookTableColsEnum {

    BOOKING_ID("booking_id","INT"),
    TABLE_ID("table_id","INT"),
    DATE_TIME("date_time","DATETIME" ),
    RANGE_TIME("range_time","LONG");

    private String colName;

    private String type;

    CalBookTableColsEnum(String colName, String type) {
        this.colName = colName;
        this.type = type;
    }

    public String getColName() {
        return colName;
    }

    public String getType() {
        return type;
    }
}
