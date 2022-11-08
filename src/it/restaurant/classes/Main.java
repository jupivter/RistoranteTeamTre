package it.restaurant.classes;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza, 4",
                "63733020363", "ilghiottone@gmail.com");

        Menu menu = new Menu(MenuTypesEnum.CARNE);

        menu.addPortata(new Bevanda("Lambrusco", 10.00));
        menu.addPortata(new Bevanda("Vino Rosso", 5.00));
        menu.addPortata(new Bevanda("Acqua frizzante", 1.50));

        menu.addPortata(new Primo("Spaghetti alla carbonara",9));
        menu.addPortata(new Primo("Pappardelle al ragu di cinghiale",11));
        menu.addPortata(new Primo("Cannelloni al ragu",10));

        //secondi

        menu.addPortata(new Dessert("Sorbetto al limone", 5.00));
        menu.addPortata(new Dessert("Parfait mandorle", 3.50));
        menu.addPortata(new Dessert("Parfait pistacchio", 3.50));

        ristorante.printRistoranteDetails();
        menu.printMenuDetails();
    }
}
