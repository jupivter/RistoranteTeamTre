
package it.restaurant.portate.secondi;

import it.restaurant.MenuTypesEnum;
import it.restaurant.portate.Portata;
/**
 * Creazione classe figlio SecondoVegano estesa alla classe padre Portata
 * Con implementazione di costruttore
 */
public class SecondoVegano extends Portata {
    public SecondoVegano(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {
        super(tipologia, menuTypesEnum, name, price);
    }
}



