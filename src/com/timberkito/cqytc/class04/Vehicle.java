package com.timberkito.cqytc.class04;

/**
 * @author 王麒皓2022231870
 */
public class Vehicle {
    // 声明double类型的变量 ：速度speed
    double speed;

    // 声明int类型的变量：功率power
    int power;

    // 定义方法：speedUp(int up)
    void speedUp(int s) {
        // 将参数s的值与成员变量speed的和，赋值给成员变量speed
        //并且控制，加速后speed不能超过200
        speed = s + speed;
        if (speed > 200) {
            speed = 200;
            System.out.println("速度不能超过200！");
        }
    }

    // 定义方法：speedDown(int d)
    // 将成员变量speed与参数d的值的差，赋值给成员变量speed
    //并且控制，减速后speed不能小于0
    void speedDown(int d) {
        speed = speed - d;
        if (speed <= 0) {
            speed = 0;
            System.out.println("速度不能小于0！");
        }
    }


    // 定义方法：setPower(int p)
    public void setPower(int power) {
        this.power = power;
    }

    // 定义方法：getSpeed()
    public double getSpeed() {
        return speed;
    }

    // 定义方法：getPower()
    public int getPower() {
        return power;
    }

}
