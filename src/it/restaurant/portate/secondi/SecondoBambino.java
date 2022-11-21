package it.restaurant.portate.secondi;

import it.restaurant.MenuTypesEnum;
import it.restaurant.portate.Portata;
/**
 * Creazione classe figlio SecondoBambino estesa alla classe padre Portata
 * Con implementazione di costruttore
 */
public class SecondoBambino extends Portata {

    public SecondoBambino(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {
        super(tipologia, menuTypesEnum, name, price);
    }
}


