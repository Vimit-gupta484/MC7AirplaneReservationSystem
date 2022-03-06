package com.challenge;

public class AirLine {
    private int flightNumber;
    private String flightName;
    private  String sourceCity;
    private  String destination;
    private int seatAvialable;
    private int fare;
    private String doj;

    public AirLine (){

    }

    public AirLine(int flightNumber, String flightName, String sourceCity, String destination, int seatAvialable,int fare, String doj) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.sourceCity = sourceCity;
        this.destination = destination;
        this.seatAvialable = seatAvialable;
        this.fare=fare;
        this.doj = doj;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeatAvialable() {
        return seatAvialable;
    }

    public void setSeatAvialable(int seatAvialable) {
        this.seatAvialable = seatAvialable;
    }
    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }


    public String toString() {
        return "AirLine{" +
                "flightNumber=" + flightNumber + ", flightName='" + flightName + '\'' + ", sourceCity='" + sourceCity + '\'' + ", destination='" + destination + '\'' +
                ", seatAvialable=" + seatAvialable + ", doj=" + doj + '}';
    }
}


