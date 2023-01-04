package it.restaurant;

import it.restaurant.portate.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    private CategoriesEnum menuCategoriesEnum;

    private List<? extends Portata> listaPortate;


    public Menu(CategoriesEnum menuCategoriesEnum){
        this.menuCategoriesEnum = menuCategoriesEnum;
        listaPortate = new ArrayList<>();
    }


    public CategoriesEnum getMenuCategoriesEnum() {
        return menuCategoriesEnum;
    }

    public List<? extends Portata> getListaPortate() {
        return listaPortate;
    }

    public List<Bevanda> getListaBevande() {
        return (List<Bevanda>) listaPortate.stream()
                                .filter(portata -> portata.getType()== TypesPortataEnum.BEVANDA)
                                .collect(Collectors.toList());
    }

    public List<Piatto> getListPiattiByTypePortata (TypesPortataEnum type) {
        return (List<Piatto>) listaPortate.stream()
                                .filter(portata -> portata.getType() == type)
                                .collect(Collectors.toList());
    }


    public static List<Piatto> filterPiatti (List<Piatto> listaPiatti, CategoriesEnum categoriesEnum){
        List<Piatto> listaFiltrata = new ArrayList<>();
        for (Piatto piatto : listaPiatti) {
            if (piatto.getCategories().equals(categoriesEnum)){
                listaFiltrata.add(piatto);
            }
        }
        System.out.println("\n------------LISTA FILTRATA------------\n");
        listaFiltrata.forEach(piatto -> piatto.stampaDettagli());
        return listaFiltrata;
    }


}
