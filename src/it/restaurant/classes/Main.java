package it.restaurant.classes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza, 4",
                "63733020363", "ilghiottone@gmail.com");

        Menu menu = new Menu(MenuTypesEnum.CARNE);

        menu.addPortata(new Bevanda("Lambrusco", 10.00));
        menu.addPortata(new Bevanda("Vino Rosso", 5.00));
        menu.addPortata(new Bevanda("Acqua frizzante", 1.50));
        

        new Primo("Spaghetti alla carbonara",9);
        new Primo("Pappardelle al ragu di cinghiale",11);
        new Primo("Cannelloni al ragu",10);

        ristorante.printRistoranteDetails();
        menu.printMenuDetails();
    }
}
