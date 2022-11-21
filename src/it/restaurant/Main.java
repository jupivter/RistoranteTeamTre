package it.restaurant;

import it.restaurant.portate.*;
import it.restaurant.portate.primi.*;
import it.restaurant.portate.secondi.*;
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

        Portata cotoletta = new SecondoBaseCarne("Secondo", MenuTypesEnum.MENU_BASECARNE, "Cotoletta", 7.50);
        Portata grigliataDiCinghiale = new SecondoBaseCarne("Secondo", MenuTypesEnum.MENU_BASECARNE, "Grigliata di cinghiale", 13.60);

        menuBaseCarne.add(spaghettiAllaCarbonara);
        menuBaseCarne.add(pappardelleAlRaguDiCinghiale);
        menuBaseCarne.add(cotoletta);
        menuBaseCarne.add(grigliataDiCinghiale);

        spaghettiAllaCarbonara.portataInfo();
        pappardelleAlRaguDiCinghiale.portataInfo();
        cotoletta.portataInfo();
        grigliataDiCinghiale.portataInfo();

        /**
         * Creazione Oggetti Primo e Secondo
         * E aggiunzione degli oggetti PrimoVegetariano e SecondoVegetariano all' ArrayList menùVegetariano
         */

        System.out.println("\n-------------------------- MENU VEGETARIANO -------------------------------------------\n");


        Portata carbonaraDiZucchine = new PrimoVegetariano("Primo", MenuTypesEnum.MENU_VEGETARIANO, "Carbonara di zucchine", 8.5);
        Portata trofieAllaCremaDiPestoEnoci = new PrimoVegetariano("Primo", MenuTypesEnum.MENU_VEGETARIANO, "Trofie alla crema di pesto e noci", 11.50);

        Portata funghiRipieniNonDiTritato = new SecondoVegetariano("Secondo", MenuTypesEnum.MENU_VEGETARIANO, "Funghi ripieni non di tritato", 10.40);
        Portata zucchineGrigliate = new SecondoVegetariano("Secondo", MenuTypesEnum.MENU_VEGETARIANO, "Zucchine grigliate", 6.40);

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

        Portata burgerVegani = new SecondoVegano("Secondo", MenuTypesEnum.MENU_VEGANO, "Burger Vegani", 8.40);
        Portata grigliataVerdure = new SecondoVegano("Secondo", MenuTypesEnum.MENU_VEGANO, "Grigliata Verdure", 9.80);

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

        Portata burgerDiMerluzzo = new SecondoCeliaco("Secondo", MenuTypesEnum.MENU_GLUTENFREE, "Burger di Merluzzo", 15.40);
        Portata croccoleSenzaGlutine = new SecondoCeliaco("Secondo", MenuTypesEnum.MENU_GLUTENFREE, "Croccole senza Glutine ", 5.40);

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

        Portata cotolettaPanata = new SecondoBambino("Secondo", MenuTypesEnum.MENU_BAMBINO, "Cotoletta Panata", 6.40);
        Portata pizzaBaby = new SecondoBambino("Secondo", MenuTypesEnum.MENU_BAMBINO, "Pizza Baby", 8.50);

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

    }
}
