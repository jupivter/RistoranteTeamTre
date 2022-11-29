package it.restaurant.portate;
/**
 * Creazione classe padre Portata
 */
public class Portata {
    /**
     *  Variabili instanziate name e price + costruttore
     */
    private String name;
    private double price;

    public Portata(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Get & Set delle variabili
     */
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

    /**
     * Metodo printPortataDetails() che ci stamperà tutte le info delle varie portate
     */
    public String printPortataDetails() {
        return name + " - " + String.format("%.2f", price) + " euro";
    }


}