package com.timberkito.cqytc.class06;

public class Ticket {
    static int ticketNum;
    private String name;

    public Ticket(String name) {
        this.name = name;
    }

    public void sell(int sellNum) {
        if (sellNum > ticketNum) {
            System.out.println("当前买票地点:" + this.name + "卖票数量过多，请减少卖票数量,当前剩余数量：" + ticketNum);
            return;
        }
        ticketNum = ticketNum - sellNum;
        System.out.println("购票成功！当前买票地点:" + this.name + "当前剩余数量：" + ticketNum);
    }
}
