package it.restaurant.portate;

import it.restaurant.Menu;
import it.restaurant.MenuTypesEnum;
/**
 * Creazione classe padre Portata estesa alla classe padre Menu
 * Con implementazione di costruttore
 */
public class Portata extends Menu {
    /**
     * Inserite due variabili di istanza private
     */
    private String tipologia;
    private String name;
    private double price;

    /**
     * Inserito metodo costruttore classe figlio con super della classe padre Menu
     * Parametrizzato con :
     * @param menuTypesEnum
     * @param name
     * @param price
     */
    public Portata(String tipologia,MenuTypesEnum menuTypesEnum, String name, double price) {
        super(menuTypesEnum);
        this.tipologia = tipologia;
        this.name = name;
        this.price = price;

    }

    /**
     * Inserito metodi Get and Set per ogni variabile di istanza privata
     * (Al momento trascurate ma che serviranno per ulteriori implementazioni del codice)
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
     * Inserito metodo info che ci aiuterà a vedere le caratteristiche di ogni portata ed a quale menu viene associato
     */

    public void portataInfo() {
        System.out.println("Portata : "+ this.tipologia  + " - " + this.name + " - " +  this.price + " euro - "+ getMenuTypesEnum());
    }
    public String portataInfo2() {
        return"Portata : "+ this.tipologia + " - " + this.name + " - " +  this.price + " euro - " + getMenuTypesEnum();
    }
