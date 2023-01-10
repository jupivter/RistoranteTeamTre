package it.logic.restaurant;

public class Table {

    private int tableNumber;
    private int numberOfSeats;

    public Table(int tableNumber, int numberOfSeats) {
        this.setTableNumber(tableNumber);
        this.setNumberOfSeats(numberOfSeats);
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void printInfoTable(){
        System.out.printf("Tavolo %-2d | Numero posti: %-2d %n", tableNumber, numberOfSeats);
    }
}
