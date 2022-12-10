package it.restaurant.portate;
/**
 * Creazione classe figlio Piatti estesa alla classe padre Portata
 * Con implementazione di costruttore
 */

public class Piatto extends Portata {

   private TypesPiattiEnum types;
   private CategoriesEnum categories;

    public Piatto(String name, double price, TypesPiattiEnum types, CategoriesEnum categories) {
        super(name, price);
        this.types =types;
        this.categories = categories;
    }

    public TypesPiattiEnum getTypes() {
        return types;
    }

    public void setTypes(TypesPiattiEnum types) {
        this.types = types;
    }

    public CategoriesEnum getCategories() {
        return categories;
    }

    public void setCategories(CategoriesEnum categories) {
        this.categories = categories;
    }

    public void stampaDettagli() {
        System.out.println("Nome del piatto : " + getName() + " - Prezzo : " + getPrice()+ " - Tipologia di Piatto : " + types +"-  Categoria di riferimento : "+ categories);
    }
}
