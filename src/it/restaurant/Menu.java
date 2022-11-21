package it.restaurant;

/**
 * Creazione della Classe padre Menu
 */
public class Menu {

    /**
     * Inserita la variabile di istanza menuTypesEnum
     */
    private MenuTypesEnum menuTypesEnum;


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