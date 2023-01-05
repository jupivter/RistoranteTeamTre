package it.tests.calendar;

import it.restaurant.calendar.CalendarBookings;
import it.restaurant.prenotazione.Cliente;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestsCalendarBookigns {

    private TestsCalendarBookigns () {}

    private CalendarBookings calendar = CalendarBookings.getInstance();

    private String [] names = {"Liam" ,	"Olivia" , "Noah" ,	"Emma", "Oliver",	"Charlotte","Elijah"	,"Amelia"
            , "James",	"Ava","William",	"Sophia" ,"Benjamin",	"Isabella", "Lucas",	"Mia",
            "Henry",	"Evelyn" ,"Theodore",	"Harper" } ;



    private LocalDate getDateFromNow (int numDays) {
        return LocalDate.now().plusDays(numDays);
    }


    private  List<Cliente> createClientsList (int number) {
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

    @Test
    private void testActivateInterval () {
        calendar.activateIntervalFromDate(LocalDate.now(),10);
        calendar.printDetailsOfAllDays();
        calendar.resetBookingsMap();
    }

    @Test
    private void testBookTable_00 () {
        calendar.activateIntervalFromDate(LocalDate.now(),10);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(12,00),70);
        calendar.printDetailsOfAllDays();
        calendar.resetBookingsMap();
    }

    @Test
    private void testOverlappingBookingAtSameTime ( ) {
        calendar.activateIntervalFromDate(LocalDate.now(),10);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(12,00),70);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(12,00),70);
        calendar.printDetailsOfAllDays();
        calendar.resetBookingsMap();
    }

    @Test
    private void testOverlappingBookingAfter ( ) {
        calendar.activateIntervalFromDate(LocalDate.now(),10);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(12,00),70);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(12,10),70);
        calendar.printDetailsOfAllDays();
        calendar.resetBookingsMap();
    }


    @Test
    private void testOverlappingBookingBefore ( ) {
        calendar.activateIntervalFromDate(LocalDate.now(),10);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(12,00),70);
        calendar.bookTable(createClientsList(4),getDateFromNow(2), LocalTime.of(11,50),70);
        calendar.printDetailsOfAllDays();
        calendar.resetBookingsMap();
    }





}
