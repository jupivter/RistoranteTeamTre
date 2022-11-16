package it.restaurant;

import it.restaurant.portate.Portata;

import java.util.ArrayList;
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

    public void printMenuDetails(){
        System.out.println("Menu: " + menuTypesEnum);
        for(Portata portata : portateList){
            portata.printPortataDetails();
        }
    }
    public void addPortata(Portata portata){
        portateList.add(portata);
    }
}
