
package it.restaurant;

import it.restaurant.portate.CategoriesEnum;
import it.restaurant.prenotazione.Tavolo;
import it.restaurant.utility.Comparators;

import java.util.*;
import java.util.stream.Collectors;

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

    //al posto di integer potremmo mettere una lista di clienti, con tavolo per chiave ("questo tavolo è occupato da questo gruppo di clienti")
    private HashMap<Integer, Tavolo> tavoli = new HashMap<>();

    private Map<CategoriesEnum, Menu> menusMap;

    /**
     * Inserito metodo costruttore Parametrizzato con :
     * @param name
     * @param address
     * @param phoneNumber
     * @param email
     */
    public Ristorante(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.menusMap = new HashMap<>();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<Integer, Tavolo> getTavoli() {
        return tavoli;
    }

    public void setTavoli(HashMap<Integer, Tavolo> tavoli) {
        this.tavoli = tavoli;
    }

    public void setMenuByCategory (CategoriesEnum category, Menu menu){
        this.menusMap.put(category,menu);
    }

    public Menu getMenuByCategory (CategoriesEnum categoryEnum) {
        return this.menusMap.get(categoryEnum);
    }

    /**
     * Inserito metodo info che ci aiuterà a vedere le varie info del ristorante
     */
    public void printRistoranteInfo(){
        System.out.println("Dati ristorante: " + name + " - " + address + " - " + phoneNumber + " - " + email);
    }

    public void aggiungiTavolo(Integer numero, Tavolo tavolo){
        tavoli.put(numero, tavolo);
    }

    public void rimuoviTavolo(Integer numero, Tavolo tavolo) {
        tavoli.put(numero, tavolo);
    }

    public Tavolo getTavoloByNumber(int numero){
        return tavoli.get(numero);
    }

    public TreeSet<Tavolo> getFreeTableFromTakenTables (Set<Tavolo>takenTables, int peopleNumber){
        Set<Tavolo> freeTables = tavoli.values().stream()
                .filter(tavolo -> !takenTables.contains(tavolo)).collect(Collectors.toSet());
        return getPossibleTablesFromFreeTables(freeTables,peopleNumber);
    }

    private TreeSet<Tavolo> getPossibleTablesFromFreeTables (Set<Tavolo>freeTables, int peopleNumber){
        TreeSet<Tavolo> possibleTables = new TreeSet<>(Comparators.getCompareTablesBySeating());
        Set<Tavolo> targetTables = freeTables.stream().filter(tavolo -> tavolo.getNumeroPostiTavolo()>=peopleNumber).collect(Collectors.toSet());
        possibleTables.addAll(targetTables);
        return possibleTables;
    }



}




