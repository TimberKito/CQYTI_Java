package com.timberkito.cqytc.class09;

public class TestClass {
    public static void main(String[] args) {
        ConstructionBank ConBank = new ConstructionBank();
        ConBank.setMoney(80000);
        ConBank.setRate(0.035);
        ConBank.setYear(8.168);
        System.out.println("建设银行利息：" + ConBank.computeInterest());

        ChongQingBank CQBank = new ChongQingBank();
        CQBank.setMoney(90000);
        CQBank.setRate(0.042);
        CQBank.setYear(8.18);
        System.out.println("重庆银行利息：" + CQBank.computeInterest());

    }
}
