package it.restaurant.classes;

public class Bevanda extends Portata {

    public Bevanda(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "name='" + super.getName()+ '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

}
