package it.restaurant;

import it.restaurant.portate.Bevanda;
import it.restaurant.portate.CategoriesEnum;
import it.restaurant.portate.Piatto;
import it.restaurant.portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private CategoriesEnum menuTypesEnum;
    private List<Piatto> listaPiatti;
    private List<Bevanda> listaBevande;


    public Menu(CategoriesEnum menuTypesEnum){
        this.menuTypesEnum = menuTypesEnum;
        listaPiatti = new ArrayList<>();
    }

    public Menu(CategoriesEnum menuTypesEnum, List<Piatto> listaPiatti){
        this.menuTypesEnum = menuTypesEnum;
        this.listaPiatti = listaPiatti;
    }

    public CategoriesEnum getMenuTypesEnum() {
        return menuTypesEnum;
    }

    public void setMenuTypesEnum(CategoriesEnum menuTypesEnum) {
        this.menuTypesEnum = menuTypesEnum;
    }

    public List<Piatto> getListaPiatti() {
        return listaPiatti;
    }

    public void setListaPiatti(List<Piatto> listaPiatti) {
        this.listaPiatti = listaPiatti;
    }

    public void addPortata(Piatto piatto){
        listaPiatti.add(piatto);
    }

    public List<Bevanda> getListaBevande() {
        return listaBevande;
    }

    public void setListaBevande(List<Bevanda> listaBevande) {
        this.listaBevande = listaBevande;
    }

    public static List<Piatto> dishFilter(List<Piatto> listaPiatti, CategoriesEnum categoriesEnum){
        List<Piatto> listaFiltrata = new ArrayList<>();
        for (Piatto piatto : listaPiatti
        ) {
            if (piatto.getCategories().equals(categoriesEnum)){
                listaFiltrata.add(piatto);
            }
        }
        System.out.println("\n------------LISTA FILTRATA------------\n");
        listaFiltrata.forEach(piatto -> piatto.stampaDettagli());
        return listaFiltrata;
    }
}
