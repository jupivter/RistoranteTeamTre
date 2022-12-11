package it.restaurant;

import it.restaurant.portate.*;
import it.restaurant.prenotazione.Tavolo;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza", "3453678987", "ilghiottone@hotmail.com");
        ristorante.printRistoranteInfo();

        Tavolo tavolo1 = new Tavolo(4, 1, true);

        ristorante.getTavoli();
        ristorante.aggiungiTavolo(1, tavolo1);
        tavolo1.infoTavolo();

        Piatto formaggi= new Piatto("Tagliere di formaggi",17.50,TypesPiattiEnum.PRIMI,CategoriesEnum.VEGETARIANO);
        Bevanda cosmopolitan = new Bevanda("Cosmopolitan", 8.50,true,false);
        cosmopolitan.stampaDettagli();
        formaggi.stampaDettagli();


    }
}
