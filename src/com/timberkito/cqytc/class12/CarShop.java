package com.timberkito.cqytc.class12;


public class CarShop {
    public static void getCar(String name) {
        switch (name) {
            case "宝马":
                ICar BMW = new BMW();
                BMW.getInfo();
                break;
            case "奔驰":
                ICar Benz = new Benz();
                Benz.getInfo();
                break;
            default:
                System.out.println("商场没有这种商品！");
                break;
        }
    }
}
