package it.restaurant.portate;
import it.restaurant.MenuTypesEnum;

/**
 * Creazione classe figlio Bevanda estesa alla classe padre Portata
 * Con implementazione di costruttore
 */

public class Bevanda extends Portata {
    public Bevanda(String tipologia, MenuTypesEnum menuTypesEnum, String name, double price) {
        super(tipologia, menuTypesEnum, name, price);
    }

}




