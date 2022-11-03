package it.restaurant.classes;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Il ghiottone", "Via Indipendenza, 4",
                "63733020363", "ilghiottone@gmail.com");

        Menu menu = new Menu("Carne");
        /*menu.getBevande().add(new Bevanda("Lambrusco", 10.00));
        menu.getBevande().add(new Bevanda("Vino Rosso", 5.00));
        menu.getBevande().add(new Bevanda("Acqua frizzante", 1.50));*/

        menu.addBevanda(new Bevanda("Lambrusco", 10.00));
        menu.addBevanda(new Bevanda("Vino Rosso", 5.00));
        menu.addBevanda(new Bevanda("Acqua frizzante", 1.50));

        ristorante.printDetails();
        menu.printDetails(ristorante.getName());
    }
}
