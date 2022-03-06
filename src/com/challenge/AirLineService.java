package com.challenge;

import java.util.LinkedList;
import java.util.List;

public class AirLineService {
    public static List<AirLine> airLineList = new LinkedList<>();

    static {
        airLineList.add(new AirLine(500, "Indigo", "Delhi", "Mumbai", 100, 5000, "22/10/2021"));
        airLineList.add(new AirLine(501, "Spicejet", "Canada", "Italy", 100, 48000, "22/10/2021"));
        airLineList.add(new AirLine(502, "Kingfisher", "Ukraine", "Russia", 100, 6000, "22/10/2021"));
        airLineList.add(new AirLine(503, "Vistara", "Europe", "China", 100, 65000, "22/10/2021"));
        airLineList.add(new AirLine(504, "AmericanExpress", "Paris", "Gurgaon", 100, 32000, "22/10/2021"));
        airLineList.add(new AirLine(505, "Boieng", "Japan", "India", 100, 11000, "22/10/2021"));
        airLineList.add(new AirLine(506, "seven7tero", "England", "Kenya", 100, 16000, "22/10/2021"));
    }

    public AirLineService() {

    }

    public static AirLine findAirLine(int flightNo) {
        AirLine temp = null;
        for (AirLine a : airLineList) {
            if (a.getFlightNumber() == flightNo) {
                temp = a;
                break;
            }
        }
        return temp;
    }

    public static void SearchflightBetweenCities(String fromCity, String toCity, String doj, int noOfSeats) {
        List<AirLine> search = new LinkedList<>();
        for (AirLine a : airLineList) {
            if (a.getSourceCity().equals(fromCity) && a.getDestination().equals(toCity) && a.getDoj().equals(doj) && a.getSeatAvialable() > noOfSeats) {
                search.add(a);

            }
        }
        if (search.size() == 0) {
            System.out.println("=====================Sorry no matching For Airline Seervice for search Criteria=====================");
        } else {
            System.out.print("FlightNo.\tFlightName.\tFlightSource.\tFlightDestination \tDateOFFlight \tSeatsAvilable\tFare");
            System.out.println();
            for (AirLine a : search) {
                System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", a.getFlightNumber(), a.getFlightName(), a.getSourceCity(), a.getDestination(), a.getDoj(), a.getSeatAvialable(), a.getFare());

            }
        }
    }

    public static void bookTickets(int flightNo, List<Passenger> passengerList) {
        //step 1 : we need to check account should be deducted from account balance
        int noOfSeats = passengerList.size();
        Passenger tempPassenger = passengerList.get(0);
        BankAccount account = tempPassenger.getBankAccount();
        AirLine tempAirline = findAirLine(flightNo);
        int fare = tempAirline.getFare();
        int totalFare = fare * noOfSeats;
        account.withdraw(totalFare);

        //step 2 : we need to subtract the number of seats which is booked ,from the actual avialable no of tickets

        tempAirline.setSeatAvialable(tempAirline.getSeatAvialable() - noOfSeats);

        //step 3 we need to add one entry (one record) into Ticket Collection
        TicketService.addNewTicket(flightNo,passengerList);
    }
}
