package it.restaurant.portate;
/**
 * Creazione classe figlio Piatti estesa alla classe padre Portata
 * Con implementazione di costruttore
 */

public class Piatto extends Portata {


   private CategoriesEnum categories;

    public Piatto(String name, double price, TypePortataEnum types, CategoriesEnum categories) {
        super(name, price,types);
        this.categories = categories;
    }



    public CategoriesEnum getCategories() {
        return categories;
    }

    public void setCategories(CategoriesEnum categories) {
        this.categories = categories;
    }

    public void stampaDettagli() {
        System.out.println("Nome del piatto : " + getName() + " - Prezzo : " + getPrice()+ " - Tipologia di Piatto : " + getType() +"-  Categoria di riferimento : "+ categories);
    }
}
