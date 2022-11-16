package it.restaurant.prenotazione;

public class Tavolo {

    private int numeroPostoTavolo;
    private int numeroTavolo;
    private boolean isFree;

    public Tavolo(int numeroPostoTavolo, int numeroTavolo, boolean isFree){
        this.numeroPostoTavolo = numeroPostoTavolo;
        this.numeroTavolo = numeroTavolo;
        this.isFree = isFree;
    }

    public int getNumeroPostoTavolo() {
        return numeroPostoTavolo;
    }

    public void setNumeroPostoTavolo(int numeroPostoTavolo) {
        this.numeroPostoTavolo = numeroPostoTavolo;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String infoTavolo() {
        return "Tavolo : "+" Numero tavolo: "+ numeroTavolo + " - Numero posti tavolo: " + numeroPostoTavolo;
    }
}
