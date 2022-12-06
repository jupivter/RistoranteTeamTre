package it.restaurant.prenotazione;

import it.restaurant.TypesEnum;
import it.restaurant.portate.Portata;

/**
 * Creazione classe Cliente
 */

public class Cliente {
    /**
     * Inserite quattro variabili di istanza private
     */
    private String nome;
    private String cognome;
    private int numeroDiCellulare;

    private TypesEnum menuTypesEnum;


    /**
     * Inserito metodo costruttore Parametrizzato con :
     * @param nome
     * @param cognome
     * @param numeroDiCellulare
     */
    public Cliente(String nome, String cognome, int numeroDiCellulare) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroDiCellulare = numeroDiCellulare;
    }


    /**
     * Inserito metodi Get and Set per ogni variabile di istanza privata
     * (Al momento trascurate ma che serviranno per ulteriori implementazioni del codice)
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumeroDiCellulare() {
        return numeroDiCellulare;
    }

    public void setNumeroDiCellulare(int numeroDiCellulare) {
        this.numeroDiCellulare = numeroDiCellulare;
    }


    /**
     * Inserito metodo info che ci aiuterà a distinguere i clienti in base alla categoria
     */
    public String datiCliente(){
        return "Cliente: " + this.nome + " - " + this.cognome;
    }

    /**
     * Inserito metodo prenota che permetterà alla classe Cliente di richiamare la classe Tavolo
     */
    //TODO dobbiamo memmorizzare da qualche parte le prenotazione
    public void prenota(Cliente cliente, Tavolo tavolo) {
        if(tavolo.isFree() == true) {
            System.out.println("Il " + cliente.datiCliente() + "\n" + "ha prenotato il " + tavolo.infoTavolo());
        }else {
            System.out.println("Il tavolo è già prenotato.\nScegli un'altro tavolo");
        }
    }

    /**
     * Inserito metodo prenota che permetterà alla classe Cliente di richiamare la classe Portata e tutte le sotto classi
     */
    public void ordina(Cliente cliente, Portata portata){
        System.out.println("Il "+ cliente.datiCliente()+ "\n"+"ha ordinato la "+ portata.printPortataDetails()+"\n");
    }



}