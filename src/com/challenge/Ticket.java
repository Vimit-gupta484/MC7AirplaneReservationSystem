package com.challenge;

import java.util.List;

public class Ticket {
    private int pnr;
    private AirLine bookedAirline;
    private List<Passenger> passengerList;

    public Ticket() {
    }

    public Ticket(int pnr, AirLine bookedAirline, List<Passenger> passengerList) {
        this.pnr = pnr;
        this.bookedAirline = bookedAirline;
        this.passengerList = passengerList;
    }

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public AirLine getBookedAirline() {
        return bookedAirline;
    }

    public void setBookedAirline(AirLine bookedAirline) {
        this.bookedAirline = bookedAirline;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}


