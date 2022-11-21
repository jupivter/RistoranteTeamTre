package it.restaurant.portate.primi;



import it.restaurant.MenuTypesEnum;

import it.restaurant.portate.Portata;

/**

 * Creazione classe figlio PrimoBaseCarne estesa alla classe padre Portata

 * Con implementazione di costruttore

 */

public class PrimoBaseCarne extends Portata {



    public PrimoBaseCarne(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {

        super(tipologia, menuTypesEnum, name, price);

    }

}