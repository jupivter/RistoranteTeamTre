package it.restaurant;

import it.restaurant.portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private TypesEnum menuTypesEnum;
    private List<Portata> portateList;


    public Menu(TypesEnum menuTypesEnum){
        this.menuTypesEnum = menuTypesEnum;
        portateList = new ArrayList<>();
    }

    public Menu(TypesEnum menuTypesEnum, List <Portata> portate){
        this.menuTypesEnum = menuTypesEnum;
        this.portateList = portate;
    }

    public TypesEnum getMenuTypesEnum() {
        return menuTypesEnum;
    }

    public void setMenuTypesEnum(TypesEnum menuTypesEnum) {
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
