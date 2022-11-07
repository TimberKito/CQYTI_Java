package com.timberkito.cqytc.class08;

public class AmericanPeople extends People {
    public void americanBoxing() {
        System.out.println("God bless America!");
    }

    @Override
    public void speakHello() {
        System.out.println("I am American！");
    }

    @Override
    public void averageHeight() {
        System.out.println("My height is：170cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("My weight is:65kg");
    }
}
