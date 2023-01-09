package it.logic.restaurant;

import it.logic.portate.CategoryEnum;
import it.logic.portate.Course;
import it.logic.utility.Comparators;

import java.util.*;
import java.util.stream.Collectors;

public class Restaurant {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private EnumMap<CategoryEnum, Menu> mappaMenu;
    private HashMap<Integer, Table> tablesMap;
    private List<Course> coursesList;

    public Restaurant(String name, String address, String phoneNumber, String email) {
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setMappaMenu(new EnumMap<>(CategoryEnum.class));
        this.setTablesMap(new HashMap<>());
        this.setListaPortate(new ArrayList<>());
    }

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

    public EnumMap<CategoryEnum, Menu> getMappaMenu() {
        return mappaMenu;
    }

    public void setMappaMenu(EnumMap<CategoryEnum, Menu> mappaMenu) {
        this.mappaMenu = mappaMenu;
    }

    public HashMap<Integer, Table> getTablesMap() {
        return tablesMap;
    }

    public void setTablesMap(HashMap<Integer, Table> tablesMap) {
        this.tablesMap = tablesMap;
    }

    public List<Course> getListaPortate() {
        return coursesList;
    }

    public void setListaPortate(List<Course> listaPortate) {
        this.coursesList = listaPortate;
    }

    public void stampaInfoRistorante(){
        System.out.printf("%-20s %n%-50s %n%-13s %n%-35s %n%n", name.toUpperCase(), address, phoneNumber, email);
    }

    /**
     * Questo metodo aggiunge un nuovo tavolo alla {@link Restaurant#tablesMap}.
     * @param numeroTavolo
     * @param numeroPosti
     */
    public void aggiungiTavolo(int numeroTavolo, int numeroPosti){
        Table table = new Table(numeroTavolo, numeroPosti);
        tablesMap.put(numeroTavolo, table);
    }

    /**
     * Questo metodo rimuove un tavolo dalla {@link Restaurant#tablesMap} a partire dal numero.
     * @param numeroTavolo
     */
    public void rimuoviTavolo(int numeroTavolo){
        tablesMap.remove(numeroTavolo);
    }

    /**
     * Questo metodo restituisce un tavolo dalla {@link Restaurant#tablesMap} a partire dal numero.
     * @param numero
     * @return
     */
    public Table getTavoloByNumber(int numero){
        return tablesMap.get(numero);
    }

    /**
     * Questo metodo filtra tra i tavoli liberi passati come primo parametro i tavoli che hanno un numero di posti maggiore
     * o uguale al numero di persone passate come secondo parametro. Il metodo restituisce i tavoli filtrati in un TreeSet ordinato in
     * base al numero di posti.
     * @param freeTables i tavoli liberi che si vogliono filtrare.
     * @param peopleNumber numero di persone che occuperanno il tavolo.
     * @return un TreeSet contenente i tavoli liberi ordinati in base al numero di posti.
     */
    private TreeSet<Table> getPossibleTablesFromFreeTables (Set<Table>freeTables, int peopleNumber){
        TreeSet<Table> possibleTables = new TreeSet<>(Comparators.getCompareTablesBySeating());
        Set<Table> targetTables = freeTables.stream().filter(table -> table.getNumberOfSeats()>=peopleNumber).collect(Collectors.toSet());
        possibleTables.addAll(targetTables);
        return possibleTables;
    }

    /**
     * Questo metodo restituisci i tavoli liberi scartando quelli occupati e utilizza il metodo {@link Restaurant#getPossibleTablesFromFreeTables}
     * per verificare la compatibilità con il numero di persone.
     * @param takenTables i tavoli occupati che si vogliono scartare.
     * @param peopleNumber numero di persone che occuperanno il tavolo.
     * @return un TreeSet contenente i tavoli liberi ordinati in base al numero di posti.
     */
    public TreeSet<Table> getFreeTableFromTakenTables (Set<Table>takenTables, int peopleNumber){
        Set<Table> freeTables = tablesMap.values().stream()
                .filter(table -> !takenTables.contains(table)).collect(Collectors.toSet());
        return getPossibleTablesFromFreeTables(freeTables,peopleNumber);
    }
}
