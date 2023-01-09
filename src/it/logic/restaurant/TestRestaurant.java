package it.logic.restaurant;

import it.logic.portate.CategoryEnum;
import it.logic.portate.CourseTypeEnum;

import java.sql.SQLException;

public class TestRestaurant {
    public static void main(String[] args) throws SQLException {

        Restaurant restaurant = new Restaurant("Il faro di Capo d'Orso", "Strada Statale Amalfitana, 44, Maiori(SA)", "089 877022", "info@ilfarodicapodorso.it");
        restaurant.stampaInfoRistorante();

        /*Tavolo2 tavolo2 = new Tavolo2(1, 4);
        tavolo2.stampaInfoTavolo();*/

        Menu menuStandard = new Menu(CategoryEnum.STANDARD);
        menuStandard.createMenuTable();
        menuStandard.addDish("Carbonara", 11.0, CourseTypeEnum.FIRST, CategoryEnum.STANDARD);
        menuStandard.addDish("Amatriciana", 10.0, CourseTypeEnum.FIRST, CategoryEnum.STANDARD);
        menuStandard.addDish("Fiorentina", 47.0, CourseTypeEnum.SECOND, CategoryEnum.STANDARD);
        menuStandard.addDish("Tiramisù", 7.0, CourseTypeEnum.DESSERT, CategoryEnum.STANDARD);
        menuStandard.addDish("Tagliere di salumi e formaggi", 11.0, CourseTypeEnum.STARTER, CategoryEnum.STANDARD);
        menuStandard.addDrink("Acqua", 2.0, false);

        menuStandard.printMenu();

    }
}
