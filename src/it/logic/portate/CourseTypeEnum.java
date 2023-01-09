package it.logic.portate;

public enum CourseTypeEnum {

    DRINK("BEVANDE"),
    STARTER("ANTIPASTI"),
    FIRST("PRIMI"),
    SECOND("SECONDI"),
    DESSERT("DESSERTS");

    private String pluralName;

    CourseTypeEnum(String pluralName){
        this.pluralName = pluralName;
    }

    public String getPluralName() {
        return pluralName;
    }
}
