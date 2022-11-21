package it.restaurant.portate.primi;



import it.restaurant.MenuTypesEnum;

import it.restaurant.portate.Portata;

/**

 * Creazione classe figlio PrimoVegano estesa alla classe padre Portata

 * Con implementazione di costruttore

 */

public class PrimoVegano extends Portata {



    public PrimoVegano(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {

        super(tipologia, menuTypesEnum, name, price);

    }

}