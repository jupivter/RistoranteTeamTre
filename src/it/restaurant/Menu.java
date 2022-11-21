package it.restaurant;

import it.restaurant.portate.Portata;

import java.util.ArrayList;

/**
 * Creazione della Classe padre Menu
 */
public class Menu {

    /**
     * Inserita la variabile di istanza menuTypesEnum
     */
    private MenuTypesEnum menuTypesEnum;
    ArrayList<Portata> menuBevande = new ArrayList<>();


    /**
     * Inserimento del metodo costruttore parametrizzato con:
     * @param menuTypesEnum
     */
    public Menu(MenuTypesEnum menuTypesEnum) {
        this.menuTypesEnum = menuTypesEnum;
    }

    /**
     * Inserito metodi Get and Set per ogni variabile di istanza privata
     * (Al momento trascurate ma che serviranno per ulteriori implementazioni del codice)
     */
    public MenuTypesEnum getMenuTypesEnum() {
        return menuTypesEnum;
    }

    public void setMenuTypesEnum(MenuTypesEnum menuTypesEnum) {
        this.menuTypesEnum = menuTypesEnum;
    }


}