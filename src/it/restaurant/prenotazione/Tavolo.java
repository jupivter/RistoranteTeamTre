package it.restaurant.prenotazione;

public class Tavolo {

    private int numeroPosto;
    private int capienza;
    private boolean isFree;

    public Tavolo(int numeroPosto, int capienza, boolean isFree){
        this.numeroPosto = numeroPosto;
        this.capienza = capienza;
        this.isFree = isFree;
    }
}
