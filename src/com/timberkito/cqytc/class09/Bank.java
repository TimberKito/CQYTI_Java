package com.timberkito.cqytc.class09;

public class Bank {
    private double rate;
    private int year;
    private double money;
    private double interest;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double computeInterest() {
        return this.money * this.year * this.rate;
    }

}
