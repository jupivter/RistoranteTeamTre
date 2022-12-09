package it.restaurant;

import it.restaurant.portate.CategoriesEnum;
import it.restaurant.portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private CategoriesEnum menuTypesEnum;
    private List<Portata> portateList;


    public Menu(CategoriesEnum menuTypesEnum){
        this.menuTypesEnum = menuTypesEnum;
        portateList = new ArrayList<>();
    }

    public Menu(CategoriesEnum menuTypesEnum, List <Portata> portate){
        this.menuTypesEnum = menuTypesEnum;
        this.portateList = portate;
    }

    public CategoriesEnum getMenuTypesEnum() {
        return menuTypesEnum;
    }

    public void setMenuTypesEnum(CategoriesEnum menuTypesEnum) {
        this.menuTypesEnum = menuTypesEnum;
    }

    public List<Portata> getPortateList() {
        return portateList;
    }

    public void setPortateList(List<Portata> portateList) {
        this.portateList = portateList;
    }

    public void addPortata(Portata portata){
        portateList.add(portata);
    }
}
