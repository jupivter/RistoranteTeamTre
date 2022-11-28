package it.restaurant.portate;

import it.restaurant.MenuTypesEnum;

public class Secondi extends Portata{

    /**
     * Inserito metodo costruttore classe figlio con super della classe padre Menu
     * Parametrizzato con :
     *
     * @param tipologia
     * @param menuTypesEnum
     * @param name
     * @param price
     */
    public Secondi(String tipologia, SecondiEnum tipoDiSecondi, MenuTypesEnum menuTypesEnum, String name, double price) {
        super(tipologia, menuTypesEnum, name, price);



    }
}
