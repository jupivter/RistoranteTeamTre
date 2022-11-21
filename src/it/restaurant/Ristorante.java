
package it.restaurant;

/**
 * Creazione classe Ristorante
 */
public class Ristorante {

    /**
     * Inserite quattro variabili di istanza private
     */
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    /**
     * Inserito metodo costruttore Parametrizzato con :
     * @param name
     * @param address
     * @param phoneNumber
     * @param email
     */
    Ristorante(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Inserito metodi Get and Set per ogni variabile di istanza privata
     * (Al momento trascurate ma che serviranno per ulteriori implementazioni del codice)
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Inserito metodo info che ci aiuterà a vedere le varie info del ristorante
     */
    public void printRistoranteInfo(){
        System.out.println("Dati ristorante: " + name + " - " + address + " - " + phoneNumber + " - " + email +
                "\n============================================================================================");
    }
}



