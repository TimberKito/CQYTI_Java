package com.timberkito.cqytc.class02;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 */
public class GameDemo01 {

    public static void main(String[] args) {
        int i = getRandNum();
        int number = getUserNum();
        // 游戏主方法
        gameMain(i, number);
    }

    /**
     * 生成随机数
     * @return int
     */
    private static int getRandNum() {
        Random random = new Random();
        return random.nextInt(10);
    }

    /**
     * 获取用户输入数
     * @return int
     */
    private static int getUserNum() {
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        try {
            System.out.println("请输入一个整数：");
            userNum = scanner.nextInt();
        } catch (Exception e) {
            getUserNum();
        }
        return userNum;
    }

    /**
     * 游戏主方法
     * @param i
     * @param number
     */
    public static void gameMain(int i, int number) {
        while (true) {
            if (number < i) {
                System.out.println("你猜小了");
            } else if (number > i) {
                System.out.println("你猜大了");
            } else if (number == i) {
                System.out.println("恭喜你，答对了");
                break;
            }
            System.out.println("再试试吧！");
            number = getUserNum();
        }
    }
}
