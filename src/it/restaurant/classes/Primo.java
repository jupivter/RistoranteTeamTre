package it.restaurant.classes;

import java.util.Arrays;
import java.util.List;

public class Primo extends Portata {
public List<String> primi;

    public List<String> getPrimo() {
        return this.primi;
    }

    public void setPrimo(List<String> primo) {
        this.primi = primo;
    }

    public Primo(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuType='  Carne"+ '\'' +
                ", Primi=" + Arrays.toString(primi.toArray()) +
                '}';
    }
}
