package it.restaurant;

import it.restaurant.portate.*;
import it.restaurant.prenotazione.Tavolo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static it.restaurant.Menu.dishFilter;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza", "3453678987", "ilghiottone@hotmail.com");
        ristorante.printRistoranteInfo();

        Tavolo tavolo1 = new Tavolo(4, 1, true);

        ristorante.getTavoli();
        ristorante.aggiungiTavolo(1, tavolo1);
        tavolo1.infoTavolo();

        Piatto formaggi= new Piatto("Tagliere di formaggi",17.50, TypesPortataEnum.PRIMI,CategoriesEnum.VEGETARIANO);
        Bevanda cosmopolitan = new Bevanda("Cosmopolitan", 8.50,true,false);
        cosmopolitan.stampaDettagli();
        formaggi.stampaDettagli();

        Piatto tagliereSalumi= new Piatto("Tagliere di salumi",17.50, TypesPortataEnum.ANTIPASTI,CategoriesEnum.BASECARNE);
        Piatto carbonara= new Piatto("Carbonara",17.50, TypesPortataEnum.PRIMI,CategoriesEnum.BASECARNE);
        Piatto amatriciana= new Piatto("Amatriciana",17.50, TypesPortataEnum.PRIMI,CategoriesEnum.BASECARNE);


        List<Piatto> listaPiatti = new ArrayList<>(Arrays.asList(tagliereSalumi, carbonara, amatriciana));

        List<Piatto> listaFiltrata = new ArrayList<>();
        listaFiltrata = dishFilter(listaPiatti, CategoriesEnum.BASECARNE);


    }
}
