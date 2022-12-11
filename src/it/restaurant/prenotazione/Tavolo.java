package it.restaurant.prenotazione;
/**
 * Creazione classe Tavolo
 */
public class Tavolo {

    /**
     * Inserite tre variabili di istanza private
     */
    private int numeroPostiTavolo;
    private int numeroTavolo;
    private boolean isFree;

    /**
     * Inserito metodo costruttore Parametrizzato con :
     * @param numeroPostiTavolo
     * @param numeroTavolo
     * @param isFree
     */
    public Tavolo(int numeroPostiTavolo, int numeroTavolo, boolean isFree){
        this.numeroPostiTavolo = numeroPostiTavolo;
        this.numeroTavolo = numeroTavolo;
        this.isFree = isFree;
    }

    /**
     * Inserito metodi Get and Set per ogni variabile di istanza privata
     * (Al momento trascurate ma che serviranno per ulteriori implementazioni del codice)
     */
    public int getNumeroPostiTavolo() {
        return numeroPostiTavolo;
    }

    public void setNumeroPostiTavolo(int numeroPostoTavolo) {
        this.numeroPostiTavolo = numeroPostoTavolo;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    /**
     * Inserimento metodo isFree()
     * Questo ci aiuterà a capire se il tavolo sarà disponibile o meno per la prenotazione del cliente
     * @return
     */
    public boolean isFree() {
        return isFree;
    }

    /**
     * Inserimento metodo setFree
     * Che ci aiuterà a settare la disponibilità del tavolo in base alle prenotazioni
     */
    public void setFree(boolean free) {
        isFree = free;
    }

    /**
     * Inserimento metodo infoTavolo() che ci aiuterà a vedere il numero del tavolo la capienza e la disponibilità
     * @return
     */
    public void infoTavolo() {
        System.out.println("Numero tavolo: "+ numeroTavolo + " - " +  "Numero posti tavolo: " + numeroPostiTavolo + " - " + "Dispinibilita del tavolo: " + isFree());
    }
}
