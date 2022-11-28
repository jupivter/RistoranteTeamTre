package it.restaurant;

import it.restaurant.portate.*;
import it.restaurant.portate.primi.*;

import it.restaurant.prenotazione.Cliente;
import it.restaurant.prenotazione.ClienteTypesEnum;
import it.restaurant.prenotazione.Tavolo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-------------------------- RISTORANTE IL GHIOTTONE --------------------------------------\n");

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza, 4",
                "63733020363", "ilghiottone@gmail.com");
        ristorante.printRistoranteInfo();

        /**
         * Creazione ArrayList MenuList contenente altri ArrayList menu
         * creazione ArrayList Menù diversificati per enumerazione
         * aggiunzione ArrayList menu all'ArrayList menuList
         */
        ArrayList<ArrayList<Portata>> listMenu = new ArrayList<>();

        ArrayList<Portata> menuBevande = new ArrayList<>();
        ArrayList<Portata> menuBaseCarne = new ArrayList<>();
        ArrayList<Portata> menuVegetariano = new ArrayList<>();
        ArrayList<Portata> menuVegano = new ArrayList<>();
        ArrayList<Portata> menuGlutenFree = new ArrayList<>();
        ArrayList<Portata> menuBambino = new ArrayList<>();
        ArrayList<Portata> menuDessert = new ArrayList<>();
        ArrayList<Tavolo> tavoliList = new ArrayList<>();

        /**
         * Predisposizione ArrayList di ordine clienti in base alla tipologia di menù scelta
         */
        List<Cliente> clientiMenuBevande = new ArrayList<>();
        List<Cliente> clientiMenuBaseCarne = new ArrayList<>();
        List<Cliente> clientiMenuVegetariano = new ArrayList<>();
        List<Cliente> clientiMenuVegano = new ArrayList<>();
        List<Cliente> clientiMenuGlutenFree = new ArrayList<>();
        List<Cliente> clientiMenuBambino = new ArrayList<>();
        List<Cliente> clientiMenuDessert = new ArrayList<>();


        listMenu.add(menuBevande);
        listMenu.add(menuBaseCarne);
        listMenu.add(menuVegetariano);
        listMenu.add(menuVegano);
        listMenu.add(menuGlutenFree);
        listMenu.add(menuBambino);
        listMenu.add(menuDessert);


        /**
         * Creazione Oggetti Bevanda
         * E aggiunzione degli oggetti Bevanda all' ArrayList menùBevande
         */

        System.out.println("\n--------------------------MENU BEVANDE ------------------------------------------------\n");


        Portata lambrusco = new Bevanda("Bevanda", MenuTypesEnum.MENU_BEVANDE, "Lambrusco", 10.00);
        Portata vinoRosso = new Bevanda("Bevanda", MenuTypesEnum.MENU_BEVANDE, "Vino Rosso", 5.00);
        Portata acquaFrizzante = new Bevanda("Bevanda", MenuTypesEnum.MENU_BEVANDE, "Acqua frizzante", 1.50);

        menuBevande.add(lambrusco);
        menuBevande.add(vinoRosso);
        menuBevande.add(acquaFrizzante);

        lambrusco.portataInfo();
        vinoRosso.portataInfo();
        acquaFrizzante.portataInfo();

        /**
         * Creazione Oggetti Primo e Secondo
         * E aggiunzione degli oggetti PrimoBaseCarne e SecondoBaseCarne all' ArrayList menùBaseCarne
         */

        System.out.println("\n-------------------------- MENU BASE CARNE --------------------------------------------\n");


        Portata spaghettiAllaCarbonara = new PrimoBaseCarne("Primo", MenuTypesEnum.MENU_BASECARNE, "Spaghetti alla carbonara", 9);
        Portata pappardelleAlRaguDiCinghiale = new PrimoBaseCarne("Primo", MenuTypesEnum.MENU_BASECARNE, "Pappardelle al ragu di cinghiale", 11);

        Portata cotolettaBaby = new Secondi("Secondo",SecondiEnum.BAMBINO,MenuTypesEnum.MENU_BAMBINO,"CotolettaBaby",7.50);
        Portata grigliataVegetariana = new Secondi("Secondo",SecondiEnum.VEGETARIANO,MenuTypesEnum.MENU_VEGETARIANO,"Grigliata di verdure",23.50);

        menuBaseCarne.add(spaghettiAllaCarbonara);
        menuBaseCarne.add(pappardelleAlRaguDiCinghiale);
        menuBaseCarne.add(cotolettaBaby);
        menuBaseCarne.add(grigliataVegetariana);

        spaghettiAllaCarbonara.portataInfo();
        pappardelleAlRaguDiCinghiale.portataInfo();
        cotolettaBaby.portataInfo();
        grigliataVegetariana.portataInfo();

        /**
         * Creazione Oggetti Primo e Secondo
         * E aggiunzione degli oggetti PrimoVegetariano e SecondoVegetariano all' ArrayList menùVegetariano
         */

        System.out.println("\n-------------------------- MENU VEGETARIANO -------------------------------------------\n");


        Portata carbonaraDiZucchine = new PrimoVegetariano("Primo", MenuTypesEnum.MENU_VEGETARIANO, "Carbonara di zucchine", 8.5);
        Portata trofieAllaCremaDiPestoEnoci = new PrimoVegetariano("Primo", MenuTypesEnum.MENU_VEGETARIANO, "Trofie alla crema di pesto e noci", 11.50);

        Portata funghiRipieniNonDiTritato = new Secondi("Secondo",SecondiEnum.VEGETARIANO, MenuTypesEnum.MENU_VEGETARIANO, "Funghi ripieni non di tritato", 10.40);
        Portata zucchineGrigliate = new Secondi("Secondo",SecondiEnum.VEGETARIANO, MenuTypesEnum.MENU_VEGETARIANO, "Zucchine grigliate", 6.40);

        menuVegetariano.add(carbonaraDiZucchine);
        menuVegetariano.add(trofieAllaCremaDiPestoEnoci);
        menuVegetariano.add(funghiRipieniNonDiTritato);
        menuVegetariano.add(zucchineGrigliate);

        carbonaraDiZucchine.portataInfo();
        trofieAllaCremaDiPestoEnoci.portataInfo();
        funghiRipieniNonDiTritato.portataInfo();
        zucchineGrigliate.portataInfo();


        /**
         * Creazione Oggetti Primo e Secondo
         * E aggiunzione degli oggetti PrimoVegano e SecondoVegano all' ArrayList menùVegano
         */


        System.out.println("\n-------------------------- MENU VEGANO ------------------------------------------------\n");


        Portata risottoCastgneEcatalogna = new PrimoVegano("Primo", MenuTypesEnum.MENU_VEGANO, "Risotto castagne e catalogna", 14);
        Portata casoncelliAllaBergamasca = new PrimoVegano("Primo", MenuTypesEnum.MENU_VEGANO, "Casoncelli alla bergamasca", 13);

        Portata burgerVegani = new Secondi("Secondo",SecondiEnum.VEGANO, MenuTypesEnum.MENU_VEGANO, "Burger Vegani", 8.40);
        Portata grigliataVerdure = new Secondi("Secondo",SecondiEnum.VEGANO, MenuTypesEnum.MENU_VEGANO, "Grigliata Verdure", 9.80);

        menuVegano.add(risottoCastgneEcatalogna);
        menuVegano.add(casoncelliAllaBergamasca);
        menuVegano.add(burgerVegani);
        menuVegano.add(grigliataVerdure);

        risottoCastgneEcatalogna.portataInfo();
        casoncelliAllaBergamasca.portataInfo();
        burgerVegani.portataInfo();
        grigliataVerdure.portataInfo();


        /**
         * Creazione Oggetti Primo e Secondo
         * E aggiunzione degli oggetti PrimoCeliaco e SecondoCeliaco all' ArrayList menùCeliaco
         */


        System.out.println("\n-------------------------- MENU GLUTENFREE --------------------------------------------\n");


        Portata tagliatelleDiGranoSaraceno = new PrimoCeliaco("Primo", MenuTypesEnum.MENU_GLUTENFREE, "Tagliatelle di grano saraceno con ragu di prosciutto crudo", 12.50);
        Portata gnocchiDiMiglio = new PrimoCeliaco("Primo", MenuTypesEnum.MENU_GLUTENFREE, "Gnocchi di miglio con asparagi e pancetta", 13.50);

        Portata burgerDiMerluzzo = new Secondi("Secondo",SecondiEnum.CELIACO, MenuTypesEnum.MENU_GLUTENFREE, "Burger di Merluzzo", 15.40);
        Portata croccoleSenzaGlutine = new Secondi("Secondo",SecondiEnum.CELIACO, MenuTypesEnum.MENU_GLUTENFREE, "Croccole senza Glutine ", 5.40);

        menuGlutenFree.add(tagliatelleDiGranoSaraceno);
        menuGlutenFree.add(gnocchiDiMiglio);
        menuGlutenFree.add(burgerDiMerluzzo);
        menuGlutenFree.add(croccoleSenzaGlutine);

        tagliatelleDiGranoSaraceno.portataInfo();
        gnocchiDiMiglio.portataInfo();
        burgerDiMerluzzo.portataInfo();
        croccoleSenzaGlutine.portataInfo();

        /**
         * Creazione Oggetti Primo e Secondo
         * E aggiunzione degli oggetti PrimoBambino e SecondoBambino all' ArrayList menùBambino
         */


        System.out.println("\n-------------------------- MENU BAMBINO -----------------------------------------------\n");


        Portata farfalleConProsciutto = new PrimoBambino("Primo", MenuTypesEnum.MENU_BAMBINO, "Farfalle con prosciutto e piselli al forno", 8);
        Portata vermicelliNeri = new PrimoBambino("Primo", MenuTypesEnum.MENU_BAMBINO, "Vermicelli neri con pomodori", 9);

        Portata cotolettaPanata = new Secondi("Secondo",SecondiEnum.BAMBINO, MenuTypesEnum.MENU_BAMBINO, "Cotoletta Panata", 6.40);
        Portata pizzaBaby = new Secondi("Secondo",SecondiEnum.BAMBINO, MenuTypesEnum.MENU_BAMBINO, "Pizza Baby", 8.50);

        menuBambino.add(farfalleConProsciutto);
        menuBambino.add(vermicelliNeri);
        menuBambino.add(cotolettaPanata);
        menuBambino.add(pizzaBaby);

        farfalleConProsciutto.portataInfo();
        vermicelliNeri.portataInfo();
        cotolettaPanata.portataInfo();
        pizzaBaby.portataInfo();

        /**
         * Creazione Oggetti Dessert
         * E aggiunzione degli oggetti Dessert all' ArrayList menùDessert
         */


        System.out.println("\n-------------------------- MENU DESSERT -----------------------------------------------\n");

        Portata sorbettoAlLimone = new Dessert("Dessert", MenuTypesEnum.MENU_DESSERT, "Sorbetto al Limone", 5.00);
        Portata parfaitMandorle = new Dessert("Dessert", MenuTypesEnum.MENU_DESSERT, "Parfait Mandorle", 3.50);
        Portata parfaitPistacchi = new Dessert("Dessert", MenuTypesEnum.MENU_DESSERT, "Parfait Pistacchi", 5.00);
        Portata cannoloScomposto = new Dessert("Dessert", MenuTypesEnum.MENU_DESSERT, "Cannolo Scomposto", 3.50);

        menuDessert.add(sorbettoAlLimone);
        menuDessert.add(parfaitMandorle);
        menuDessert.add(parfaitPistacchi);
        menuDessert.add(cannoloScomposto);

        sorbettoAlLimone.portataInfo();
        parfaitMandorle.portataInfo();
        parfaitPistacchi.portataInfo();
        cannoloScomposto.portataInfo();


        /**
         * Inseriamo un ciclo for con for annidato per mandare a schermo,
         * tutti gli oggetti contenenti nelle liste menu a sua volta contenute dalla listMenu principale
         *
         * Lo commentiamo qualora ci fosse necessita di implementarlo causa codice lento.
         * PS. In caso di implementazione del for cancellare i vari Object.portatainfo().
         */

       /* System.out.println("\n-------------------------- MENU LIST --------------------------------------------------\n");

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println("");
            for (int j = 0; j < listMenu.get(i).size(); j++)
            {
                System.out.println("Menù " +Arrays.asList(listMenu.get(i).get(j).portataInfo2())+ " ");
            }
        }*/


        /**
         * Creazione Oggetti Tavolo
         */

        System.out.println("\n-------------------------- TAVOLI -----------------------------------------------------\n");


        Tavolo tavolo1 = new Tavolo(2, 1, true);
        Tavolo tavolo2 = new Tavolo(2, 2, true);
        Tavolo tavolo3 = new Tavolo(4, 3, true);
        Tavolo tavolo4 = new Tavolo(6, 4, true);
        Tavolo tavolo5 = new Tavolo(8, 5, true);

        tavoliList.add(tavolo1);
        tavoliList.add(tavolo2);
        tavoliList.add(tavolo3);
        tavoliList.add(tavolo4);
        tavoliList.add(tavolo5);


        /**
         * Creazione oggetti clienti
         */

        System.out.println("\n-------------------------- CLIENTI ----------------------------------------------------\n");


        Cliente lucaRossi = new Cliente("Luca", "Rossi",ClienteTypesEnum.BASECARNE, 327302658);
        Cliente marcoVerdi = new Cliente("Marco", "Verdi",ClienteTypesEnum.VEGETARIANO, 328304968);
        Cliente federicoBianchi = new Cliente("Federico", "Bianchi", ClienteTypesEnum.VEGANO, 329305568);
        Cliente brunoNeri = new Cliente("Bruno", "Neri", ClienteTypesEnum.CELIACO, 329621945);
        Cliente alfonsoLilla = new Cliente("Alfonso", "Lilla", ClienteTypesEnum.BASECARNE, 329735945);
        Cliente alfredoFucsia = new Cliente("Alfredo", "Fucsia", ClienteTypesEnum.BASECARNE, 327773945);
        Cliente lorenzoMarrone = new Cliente("Lorenzo", "Marrone", ClienteTypesEnum.CELIACO, 329665945);



        /**
         * Sezione dedicata allo sviluppo del metodo Prenota()
         * in cui ogni cliente o gruppi di clienti possono prenotare i tavoli del ristorante grazie al metodo
         * implementato nella classe cliente "prenota()"
         */
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("\n------------------------ PRENOTAZIONI -------------------------------------------------\n");

        lucaRossi.prenota(lucaRossi, tavolo3);


        System.out.println("\n---------------------------------------------------------------------------------------\n");


        brunoNeri.prenota(brunoNeri, tavolo1);

        /**
         * Sezione dedicata allo sviluppo del metodo Ordina()
         * in cui ogni cliente o gruppi di clienti possono ordinare le portate in base al menu da loro scelto.
         * Metodo implementato nella classe cliente "ordina()"
         */
        System.out.println("\n------------------------ ORDINAZIONI --------------------------------------------------\n");


        brunoNeri.ordina(brunoNeri, zucchineGrigliate);
        lorenzoMarrone.ordina(lorenzoMarrone,gnocchiDiMiglio);

        lucaRossi.ordina(lucaRossi, spaghettiAllaCarbonara);
        marcoVerdi.ordina(marcoVerdi, grigliataVerdure);
        federicoBianchi.ordina(federicoBianchi, croccoleSenzaGlutine);
        alfonsoLilla.ordina(alfonsoLilla,grigliataVegetariana);
        alfredoFucsia.ordina(alfredoFucsia,pappardelleAlRaguDiCinghiale);



        System.out.println("\n---------------------------------------------------------------------------------------\n");


        /**
         * Raggruppamento di clienti classificato in base alla tipologia di menù scelto
         */

        clientiMenuBaseCarne.add(lucaRossi);
        clientiMenuBaseCarne.add(alfonsoLilla);
        clientiMenuBaseCarne.add(alfredoFucsia);

        for(Cliente cliente : clientiMenuBaseCarne){
            System.out.println("Le ordinazioni del "+ MenuTypesEnum.MENU_BASECARNE+" - "+cliente.datiCliente2());
        }

        clientiMenuGlutenFree.add(brunoNeri);
        clientiMenuGlutenFree.add(lorenzoMarrone);

        System.out.println("");
        for(Cliente cliente : clientiMenuGlutenFree){
            System.out.println("Le ordinazioni del "+ MenuTypesEnum.MENU_GLUTENFREE+" - "+cliente.datiCliente2());
        }

    }
}
