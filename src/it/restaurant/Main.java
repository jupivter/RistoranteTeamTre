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


        Portata lambrusco = new Bevanda("Bevanda",MenuTypesEnum.MENU_BEVANDE, "Lambrusco", 10.00);
        Portata vinoRosso = new Bevanda("Bevanda",MenuTypesEnum.MENU_BEVANDE, "Vino Rosso", 5.00);
        Portata acquaFrizzante = new Bevanda("Bevanda",MenuTypesEnum.MENU_BEVANDE, "Acqua frizzante", 1.50);

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


        Portata spaghettiAllaCarbonara = new PrimoBaseCarne("Primo",MenuTypesEnum.MENU_BASECARNE, "Spaghetti alla carbonara", 9);
        Portata pappardelleAlRaguDiCinghiale = new PrimoBaseCarne("Primo",MenuTypesEnum.MENU_BASECARNE, "Pappardelle al ragu di cinghiale", 11);

        Portata cotoletta = new SecondoBaseCarne("Secondo",MenuTypesEnum.MENU_BASECARNE, "Cotoletta", 7.50);
        Portata grigliataDiCinghiale = new SecondoBaseCarne("Secondo",MenuTypesEnum.MENU_BASECARNE, "Grigliata di cinghiale", 13.60);

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


        Portata carbonaraDiZucchine = new PrimoVegetariano("Primo",MenuTypesEnum.MENU_VEGETARIANO,"Carbonara di zucchine", 8.5);
        Portata trofieAllaCremaDiPestoEnoci = new PrimoVegetariano("Primo",MenuTypesEnum.MENU_VEGETARIANO,"Trofie alla crema di pesto e noci", 11.50);

        Portata funghiRipieniNonDiTritato = new SecondoVegetariano("Secondo",MenuTypesEnum.MENU_VEGETARIANO, "Funghi ripieni non di tritato", 10.40);
        Portata zucchineGrigliate = new SecondoVegetariano("Secondo",MenuTypesEnum.MENU_VEGETARIANO, "Zucchine grigliate", 6.40);

        menuVegetariano.add(carbonaraDiZucchine);
        menuVegetariano.add(trofieAllaCremaDiPestoEnoci);
        menuVegetariano.add(funghiRipieniNonDiTritato);
        menuVegetariano.add(zucchineGrigliate);

        carbonaraDiZucchine.portataInfo();
        trofieAllaCremaDiPestoEnoci.portataInfo();
        funghiRipieniNonDiTritato.portataInfo();
        zucchineGrigliate.portataInfo();
