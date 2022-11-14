package com.timberkito.cqytc.class10;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Shop shop = new Shop();
        String[] types = {"台式机", "笔记本", "商务笔记本", "游戏本"};
        shop.setTypes(types);
        System.out.println("商场里面的电脑有：");
        shop.showComputer();
        System.out.println("请输入选择的电脑类型：");
        String userType = new Scanner(System.in).nextLine();
        shop.chooseComputer(userType);
    }
}
