package com.challenge;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Current Location");
        String fromCity = scanner.nextLine();
        System.out.println("Enter the destination");
        String toCity = scanner.nextLine();
        System.out.println("Enter the Journey date");
        String doj = scanner.nextLine();
        System.out.println("Enter the Number of Seats You wants");
        int noOfSeats = scanner.nextInt();
        AirLineService.SearchflightBetweenCities(fromCity, toCity, doj, noOfSeats);

        BankAccount b1 = new BankAccount();
        b1.setAccNo(456987);
        b1.setActBalance(100000);
        Passenger p1 = new Passenger(100, "vimit", 24, b1);
        Passenger p2 = new Passenger(101, "Smith", 52, b1);
        Passenger p3 = new Passenger(102, "Ram", 34, b1);
        List<Passenger> passengerList = new LinkedList<>();
        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);
        System.out.println("Now booking ticket for Flight Number");
       System.out.println("Enter flight number");
       int flightNo = scanner.nextInt();
        AirLineService.bookTickets(501, passengerList);

        System.out.println("Now printing the details");
        TicketService.showTicketDetails(1);

    }
}
