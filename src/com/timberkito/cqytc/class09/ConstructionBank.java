package com.timberkito.cqytc.class09;

import java.util.Arrays;

public class ConstructionBank extends Bank {
    private double year;

    public void setYear(double year) {
        this.year = year;
    }

    private final double dayLilv = 0.0001;

    @Override
    public double computeInterest() {
        super.setYear((int) this.year);
        return getDays() * this.dayLilv * super.getMoney() + super.computeInterest();
    }

    private int getDays() {
        return Arrays.stream(Double.toString(this.year).split("\\.")).skip(1).map(Integer::parseInt).findAny().orElse(0);
    }
}
