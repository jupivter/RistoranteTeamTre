package it.restaurant.classes;

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

        Tavolo tavolo1 = new Tavolo(01, 4,true);
        Tavolo tavolo2 = new Tavolo(10, 8,true);


        menu.addPortata(new Bevanda("Lambrusco", 10.00));
        menu.addPortata(new Bevanda("Vino Rosso", 5.00));
        menu.addPortata(new Bevanda("Acqua frizzante", 1.50));

        menu.addPortata(new Primo("Spaghetti alla carbonara",9));
        menu.addPortata(new Primo("Pappardelle al ragu di cinghiale",11));
        menu.addPortata(new Primo("Cannelloni al ragu",10));

        menu.addPortata(new Secondo("Cotoletta",7.50));
        menu.addPortata(new Secondo("Grigliata di cinghiale",13.60));
        menu.addPortata(new Secondo("Funghi ripieni",10.40));

        menu.addPortata(new Dessert("Sorbetto al limone", 5.00));
        menu.addPortata(new Dessert("Parfait mandorle", 3.50));
        menu.addPortata(new Dessert("Parfait pistacchio", 3.50));

        ristorante.printRistoranteDetails();
        menu.printMenuDetails();

        System.out.println("-------------------------------------------------------------------");

        cliente1.prenota(cliente1,tavolo1);
        cliente2.prenota(cliente2,tavolo2);
    }
}
