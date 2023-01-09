package it.logic.calendar;

import it.logic.restaurant.Restaurant;
import it.logic.prenotazione.Client;
import it.logic.restaurant.Table;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCalendar {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Il ghiottone", "Via Indipendenza", "3453678987", "ilghiottone@hotmail.com");

        restaurant.getTablesMap().put(1, new Table(5, 1));
        restaurant.getTablesMap().put(2, new Table(4, 2));
        restaurant.getTablesMap().put(3, new Table(2, 3));
        restaurant.getTablesMap().put(4, new Table(3, 4));
        restaurant.getTablesMap().put(5, new Table(3, 5));
        restaurant.getTablesMap().put(6, new Table(7, 6));

        CalendarBookings calendar = new CalendarBookings(restaurant);
        calendar.activateIntervalFromDate(LocalDate.now(),30);
        //calendar.printDetails();
        StatusBookingEnum status = calendar.bookTable(createClientsList(4),getDateFromNow(5), LocalTime.of(12,00),45);
        System.out.println(status.getInfo());
        calendar.bookTable(createClientsList(4),getDateFromNow(5),LocalTime.of(12,05),55);
        calendar.bookTable(createClientsList(5),getDateFromNow(5), LocalTime.of(12,00),70);
        calendar.printDetailsOfAllDays();

    }

    public static LocalDate getDateFromNow (int numDays) {
        return LocalDate.now().plusDays(numDays);
    }

    public static List<Client> createClientsList (int number) {
        Random random = new Random();
        List<Client> clientsList = new ArrayList<>();
        for(int i=0; i<number; i++){
            String randomName = names[random.nextInt(names.length)];
            String randomSurname = names[random.nextInt(names.length)];
            int randomPhoneNumber = random.nextInt(9999);
            clientsList.add(new Client(randomName,randomSurname,randomPhoneNumber));
        }
        return clientsList;
    }

    public static String [] names = {"Liam" ,	"Olivia" , "Noah" ,	"Emma", "Oliver",	"Charlotte","Elijah"	,"Amelia"
                                , "James",	"Ava","William",	"Sophia" ,"Benjamin",	"Isabella", "Lucas",	"Mia",
                                 	"Henry",	"Evelyn" ,"Theodore",	"Harper" } ;
}
