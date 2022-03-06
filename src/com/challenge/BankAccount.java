package com.challenge;

public class BankAccount {
    private int accNo;
    private int actBalance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getActBalance() {
        return actBalance;
    }

    public void setActBalance(int actBalance) {
        this.actBalance = actBalance;
    }
    public void deposit(int amount){
        actBalance+=amount;
    }
    public void withdraw (int amount){
        actBalance-=amount;
    }
    public void showBalance(){
        System.out.println("Act Balance ="+actBalance);
    }
}


