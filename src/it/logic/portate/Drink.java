package it.logic.portate;

public class Drink extends Course {

    private boolean alcoholic;

    /**
     * Questo costruttore crea una bevanda attribuendo in automatico 'BEVANDA' al tipo della portata.
     * @param name
     * @param price
     */
    public Drink(String name, double price, boolean alcoholic) {
        super(name, price, CourseTypeEnum.DRINK);
        this.alcoholic = alcoholic;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
}
