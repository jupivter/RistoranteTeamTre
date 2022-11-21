

package it.restaurant.portate.primi;



import it.restaurant.MenuTypesEnum;

import it.restaurant.portate.Portata;

/**

 * Creazione classe figlio PrimoCeliaco estesa alla classe padre Portata

 * Con implementazione di costruttore

 */

public class PrimoCeliaco extends Portata {



    public PrimoCeliaco(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {

        super(tipologia, menuTypesEnum, name, price);

    }

}