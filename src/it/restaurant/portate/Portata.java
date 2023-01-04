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
    private TypesPortataEnum type;

    public Portata(String name, double price, TypesPortataEnum type) {
        this.name = name;
        this.price = price;
        this.type = type;
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


    public TypesPortataEnum getType() {
        return type;
    }

    public void setType(TypesPortataEnum type) {
        this.type = type;
    }

    /**
     * Metodo printPortataDetails() che ci stamperà tutte le info delle varie portate
     */
    public void stampaDettagli() {
        System.out.println("Nome : " + name + " - " + price);
    }


}