package it.restaurant.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private String menuType;
    private List<Portata> portateList;


    public Menu(String menuType){
        this.menuType = menuType;
        portateList = new ArrayList<>();
    }

    public Menu(String menuType, List <Portata> portate){
        this.menuType = menuType;
        this.portateList = portate;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "menuType='" + menuType + '\'' +
                ", bevande=" + Arrays.toString(portateList.toArray()) +
                '}';
    }

    public void printDetails(String restaurantName){
        System.out.println(restaurantName + "\n" + "Menu: " + menuType.toLowerCase());
        for(Portata portata : portateList){
            portata.printDetails();
        }
    }

    public void addPortata(Portata portata){
        portateList.add(portata);
    }
}
