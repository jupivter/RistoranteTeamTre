package it.restaurant.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private MenuTypesEnum menuTypesEnum;
    private List<Portata> portateList;


    public Menu(MenuTypesEnum menuTypesEnum){
        this.menuTypesEnum = menuTypesEnum;
        portateList = new ArrayList<>();
    }

    public Menu(MenuTypesEnum menuTypesEnum, List <Portata> portate){
        this.menuTypesEnum = menuTypesEnum;
        this.portateList = portate;
    }

    public MenuTypesEnum getMenuTypesEnum() {
        return menuTypesEnum;
    }

    public void setMenuTypesEnum(MenuTypesEnum menuTypesEnum) {
        this.menuTypesEnum = menuTypesEnum;
    }

    public List<Portata> getPortateList() {
        return portateList;
    }

    public void setPortateList(List<Portata> portateList) {
        this.portateList = portateList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuType='" + menuTypesEnum + '\'' +
                ", bevande=" + Arrays.toString(portateList.toArray()) +
                '}';
    }

    public void printDetails(String restaurantName){
        System.out.println(restaurantName + "\n" + "Menu: " + menuTypesEnum);
        for(Portata portata : portateList){
            portata.printDetails();
        }
    }

    public void addPortata(Portata portata){
        portateList.add(portata);
    }
}
