package com.timberkito.cqytc.class05;

public class Land {
    public static void main(String[] args) {
        Village.setWaterAmount(200);
        Village zao = new Village("赵庄", 80);
        Village ma = new Village("马家河子", 120);
        System.out.println("赵庄的人口为：" + zao.getPeopleNumber());
        System.out.println("马家河子的人口为：" + ma.getPeopleNumber());

        System.out.println("------------------------------");

        zao.drinkWater(50);
        ma.drinkWater(100);
        System.out.println("赵家喝了50,马家喝了100，村庄剩余："+Village.getWaterAmount());
    }
}
