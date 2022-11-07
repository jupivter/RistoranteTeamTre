package it.restaurant.classes;

public class Ristorante {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    Ristorante(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printRistoranteDetails(){
        System.out.println("Dati ristorante: " + name + " - " + address + " - " + phoneNumber + " - " + email);
    }
}
