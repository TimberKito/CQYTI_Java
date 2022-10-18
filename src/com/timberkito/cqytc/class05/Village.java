package com.timberkito.cqytc.class05;

public class Village {
    int peopleNumber;
    String name;
    static int waterAmount;

    void drinkWater(int d) {
        waterAmount = waterAmount - d;
    }

    public static void setWaterAmount(int waterAmount) {
        Village.waterAmount = waterAmount;
    }

    public static int getWaterAmount() {
        return waterAmount;
    }

    public Village() {
    }

    public Village(String name, int peopleNumber) {
        this.peopleNumber = peopleNumber;
        this.name = name;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
