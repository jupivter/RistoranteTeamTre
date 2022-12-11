package it.restaurant.calendar;

import it.restaurant.prenotazione.Cliente;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCalendar {

    public static void main(String[] args) {
        CalendarBookings calendar = CalendarBookings.getInstance();
        calendar.activateIntervalFromDate(LocalDate.now(),30);
        //calendar.printDetails();
        StatusBookingEnum status = calendar.bookTable(createClientsList(4),getDateFromNow(5), LocalTime.of(12,00),45);
        System.out.println(status.getInfo());
        calendar.bookTable(createClientsList(4),getDateFromNow(5),LocalTime.of(12,05),55);
        calendar.printDetails();

    }

    public static LocalDate getDateFromNow (int numDays) {
        return LocalDate.now().plusDays(numDays);
    }


    public static List<Cliente> createClientsList (int number) {
        Random random = new Random();
        List<Cliente> clientsList = new ArrayList<>();
        for(int i=0; i<number; i++){
            String randomName = names[random.nextInt(names.length)];
            String randomSurname = names[random.nextInt(names.length)];
            int randomPhoneNumber = random.nextInt(9999);
            clientsList.add(new Cliente(randomName,randomSurname,randomPhoneNumber));
        }
        return clientsList;
    }


    public static String [] names = {"Liam" ,	"Olivia" , "Noah" ,	"Emma", "Oliver",	"Charlotte","Elijah"	,"Amelia"
                                , "James",	"Ava","William",	"Sophia" ,"Benjamin",	"Isabella", "Lucas",	"Mia",
                                 	"Henry",	"Evelyn" ,"Theodore",	"Harper" } ;


}
