package com.challenge;

public class Passenger {
    private int passengerid;
    private String passengerName;
    private int passengerAge;
    private BankAccount bankAccount;

    public Passenger(int passengerid, String passengerName, int passengerAge, BankAccount bankAccount) {
        this.passengerid = passengerid;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.bankAccount = bankAccount;
    }

    public int getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(int passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}

