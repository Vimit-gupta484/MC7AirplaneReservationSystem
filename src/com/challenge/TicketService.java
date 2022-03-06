package com.challenge;

import java.util.LinkedList;
import java.util.List;

public class TicketService {
    private static List<Ticket> allTickets=new LinkedList<>();

    public static void addNewTicket(int flightNo, List<Passenger> passengerList) {
        int pnr = allTickets.size() + 1;
        AirLine bookedAirline = AirLineService.findAirLine(flightNo);
        allTickets.add(new Ticket(pnr, bookedAirline, passengerList));
        System.out.println("Ticket booked Successfully............");
    }
    public static void showTicketDetails(int pnr){
        Ticket tempTicket=null;
        for(Ticket t:allTickets){
            if(t.getPnr()==pnr){
                tempTicket=t;
                break;
            }
        }
        AirLine tempAirline=tempTicket.getBookedAirline();
        List<Passenger> passengerList =tempTicket.getPassengerList();
        int totalFare=tempAirline.getFare()*passengerList.size();
        System.out.println("**************Your Booking Details**************");
        System.out.println("PNR"+tempTicket.getPnr()+"FlightNo"+tempAirline.getFlightNumber());
        System.out.println("Flight name"+tempAirline.getFlightName());
        System.out.println("From source City"+tempAirline.getSourceCity()+"To destination"+tempAirline.getDestination());
        System.out.println("DOJ"+tempAirline.getDoj()+"Fare"+tempAirline.getFare()+"Total fare"+totalFare);
        System.out.println("\n Passenger info below \n");
        for(Passenger p:passengerList){
            System.out.println(p.getPassengerName()+"\t"+p.getPassengerAge());
        }

        System.out.println("***********************************************");




    }
}
