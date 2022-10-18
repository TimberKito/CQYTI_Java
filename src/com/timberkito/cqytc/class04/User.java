package com.timberkito.cqytc.class04;

public class User {
    public static void main(String[] args) {
        // 使用new 运算符和默认的构造方法创建对象car1 car2
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();
        // 分别设置car1 car2的功率为155和115
        car1.setPower(155);
        car2.setPower(115);
        // 输出car1 car2的功率
        System.out.println("car1的功率是：" + car1.getPower());
        System.out.println("car2的功率是：" + car2.getPower());
        // car1调用speedUp()方法将自己的speed的值增加80
        car1.speedUp(80);
        // car2调用speedUp()方法将自己的speed的值增加60
        car2.speedUp(60);
        // 输出car1 和car2的速度：
        System.out.println("car1的速度为：" + car1.getSpeed());
        // car1调用speedDown()方法将自己的speed的值减少20
        System.out.println("car2的速度为：" + car2.getSpeed());
        // car2调用speedDown()方法将自己的speed的值减少30
        car2.speedDown(30);
        // 输出car1 和car2的速度：
        System.out.println("car1的速度是：" + car1.getSpeed());
        System.out.println("car2的速度是：" + car2.getSpeed());
    }

}
