package it.restaurant;

import it.restaurant.portate.*;
import it.restaurant.portate.primi.*;
import it.restaurant.portate.secondi.*;
import it.restaurant.prenotazione.Cliente;
import it.restaurant.prenotazione.ClienteTypesEnum;
import it.restaurant.prenotazione.Tavolo;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza, 4",
                "63733020363", "ilghiottone@gmail.com");

        Menu menu = new Menu(MenuTypesEnum.CARNE);

        Cliente cliente1 = new Cliente("Luca", "Rossi", ClienteTypesEnum.CARNIVORO, 327302658);
        Cliente cliente2 = new Cliente("Marco", "Verdi",ClienteTypesEnum.CARNIVORO, 328302568);
        Cliente cliente3 = new Cliente("Michele","Signorini",ClienteTypesEnum.CELIACO,333445661);

        Tavolo tavolo1 = new Tavolo(01, 4,true);
        Tavolo tavolo2 = new Tavolo(10, 8,true);
        Tavolo tavolo3 = new Tavolo(4,3,true);


        menu.addPortata(new Bevanda("Lambrusco", 10.00));
        menu.addPortata(new Bevanda("Vino Rosso", 5.00));
        menu.addPortata(new Bevanda("Acqua frizzante", 1.50));
        // Primi di carne
        menu.addPortata(new Primo("Spaghetti alla carbonara",9));
        menu.addPortata(new Primo("Pappardelle al ragu di cinghiale",11));
        // Primi vegetariani
        menu.addPortata(new PrimoVegetariano("Carbonara di zucchine",8.5));
        menu.addPortata(new PrimoVegetariano("Trofie alla crema di pesto e noci",11.50));
        // Primi vegani
        menu.addPortata(new PrimoVegano("Risotto castagne e catalogna",14));
        menu.addPortata(new PrimoVegano("Casoncelli alla bergamasca",13));
        // Primi celiaci
        menu.addPortata(new PrimoCeliaco("Tagliatelle di grano saraceno con ragu di prosciutto crudo",12.50));
        menu.addPortata(new PrimoCeliaco("Gnocchi di miglio con asparagi e pancetta",13.50));
        // Primi bambino
        menu.addPortata(new PrimoBambino("Farfalle con prosciutto e piselli al forno",8));
        menu.addPortata(new PrimoBambino("Vermicelli neri con pomodori",9));

        menu.addPortata(new SecondoBaseCarne("Cotoletta",7.50));
        menu.addPortata(new SecondoBaseCarne("Grigliata di cinghiale",13.60));
        menu.addPortata(new SecondoVegetariano("Funghi ripieni non di tritato",10.40));
        menu.addPortata(new SecondoVegetariano("Zucchine grigliate",6.40));
        menu.addPortata(new SecondoVegano("Burger Vegani",8.40));
        menu.addPortata(new SecondoVegano("Grigliata Verdure",9.80));
        menu.addPortata(new SecondoCeliaco("Burger di Merluzzo",15.40));
        menu.addPortata(new SecondoCeliaco("Croccole senza Glutine ",5.40));
        menu.addPortata(new SecondoBambino("Cotoletta Panata",6.40));
        menu.addPortata(new SecondoBambino("Pizza Baby",8.50));

        menu.addPortata(new Dessert("Sorbetto al limone", 5.00));
        menu.addPortata(new Dessert("Parfait mandorle", 3.50));
        menu.addPortata(new Dessert("Parfait pistacchio", 3.50));

        ristorante.printRistoranteDetails();

        menu.printMenuDetails();

        System.out.println("-----------------------------AREA_PRENOTAZIONE-------------------------------------");

        cliente1.prenota(cliente1,tavolo1);

        cliente2.prenota(cliente2,tavolo2);

        cliente3.prenota(cliente3,tavolo3);
    }
}
