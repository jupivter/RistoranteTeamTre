package it.restaurant.portate.secondi;

import it.restaurant.MenuTypesEnum;
import it.restaurant.portate.Portata;
/**
 * Creazione classe figlio SecondoBaseCarne estesa alla classe padre Portata
 * Con implementazione di costruttore
 */
public class SecondoBaseCarne extends Portata {

    public SecondoBaseCarne(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {
        super(tipologia, menuTypesEnum, name, price);
    }
}


