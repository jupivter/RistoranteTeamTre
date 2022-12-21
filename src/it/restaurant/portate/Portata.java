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
    private TypesPortataEnum types;

    public Portata(String name, double price, TypesPortataEnum types) {
        this.name = name;
        this.price = price;
        this.types =types;
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


    public TypesPortataEnum getTypes() {
        return types;
    }

    public void setTypes(TypesPortataEnum types) {
        this.types = types;
    }

    /**
     * Metodo printPortataDetails() che ci stamperà tutte le info delle varie portate
     */
    public void stampaDettagli() {
        System.out.println("Nome : " + name + " - " + price);
    }


}