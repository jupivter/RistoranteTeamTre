package it.restaurant;
import it.restaurant.portate.*;
import it.restaurant.prenotazione.Cliente;
import it.restaurant.prenotazione.Tavolo;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza, 4",
                "63733020363", "ilghiottone@gmail.com");

        Menu menu = new Menu(MenuTypesEnum.BASECARNE);

        Cliente cliente1 = new Cliente("Luca", "Rossi", 327302658);
        Cliente cliente2 = new Cliente("Marco", "Verdi", 328302568);

        Tavolo tavolo1 = new Tavolo(4, 4, true);
        Tavolo tavolo2 = new Tavolo(10, 8, true);


        menu.addPortata(new Bevanda("Lambrusco", 10.00));
        menu.addPortata(new Bevanda("Vino Rosso", 5.00));
        menu.addPortata(new Bevanda("Acqua frizzante", 1.50));

        menu.addPortata(new Primi("Spaghetti alla carbonara", 9));
        menu.addPortata(new Primi("Pappardelle al ragu di cinghiale", 11));
        menu.addPortata(new Primi("Cannelloni al ragu", 10));

        menu.addPortata(new Secondi("Cotoletta", 7.50));
        menu.addPortata(new Secondi("Grigliata di cinghiale", 13.60));
        menu.addPortata(new Secondi("Funghi ripieni", 10.40));

        menu.addPortata(new Dessert("Sorbetto al limone", 5.00));
        menu.addPortata(new Dessert("Parfait mandorle", 3.50));
        menu.addPortata(new Dessert("Parfait pistacchio", 3.50));
        menu.addPortata(new Dessert("Cannolo Scomposto", 4.50));


        ristorante.printRistoranteInfo();

        menu.printMenuDetails();


        System.out.println("-----------------------------AREA_PRENOTAZIONE-------------------------------------");

        cliente1.prenota(cliente1, tavolo1);

        cliente2.prenota(cliente2, tavolo2);


    }
}
