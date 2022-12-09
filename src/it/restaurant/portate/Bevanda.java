package it.restaurant.portate;

/**
 * Creazione classe figlio Bevanda estesa alla classe padre Portata
 * Con implementazione di costruttore
 */

public class Bevanda extends Portata {
    private boolean alcoholic;
    private boolean ice;


    public Bevanda(String name, double price, boolean alcoholic, boolean ice) {
        super(name, price);
        this.alcoholic = alcoholic;
        this.ice = ice;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public void stampaDettagli() {
        System.out.println("Nome : " + getName() + " - Prezzo : " + getPrice() + " - alcol presente : " + alcoholic + " - con ghiaccio :  " + ice);
    }
}
