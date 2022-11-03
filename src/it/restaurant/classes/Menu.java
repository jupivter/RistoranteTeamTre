package it.restaurant.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private String menuType;
    private List<Bevanda> bevande;

    public Menu(String menuType){
        this.menuType = menuType;
        bevande = new ArrayList<>();
    }

    public Menu(String menuType, List <Bevanda> bevande){
        this.menuType = menuType;
        this.bevande = bevande;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        this.bevande = bevande;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuType='" + menuType + '\'' +
                ", bevande=" + Arrays.toString(bevande.toArray()) +
                '}';
    }

    public void printDetails(String restaurantName){
        System.out.println(restaurantName + "\n" + "Menu: " + menuType.toLowerCase());
        for(Bevanda bevanda : bevande){
            bevanda.printDetails();
        }
    }

    public void addBevanda(Bevanda bevanda){
        this.bevande.add(bevanda);
    }

}
