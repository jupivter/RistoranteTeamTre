package it.restaurant.portate;

public class Portata {

    private String name;
    private double price;

    public Portata(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printPortataDetails() {
        System.out.println(name + " - " + String.format("%.2f", price) + " euro");
    }

}

