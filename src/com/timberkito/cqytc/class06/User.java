package com.timberkito.cqytc.class06;

public class User {
    public static void main(String[] args) {
        Ticket.ticketNum=100;

        Ticket ticket1 = new Ticket("售票点1");
        Ticket ticket2 = new Ticket("售票点2");
        Ticket ticket3 = new Ticket("售票点3");

        ticket1.sell(30);
        ticket2.sell(200);
        ticket3.sell(40);
    }
}
