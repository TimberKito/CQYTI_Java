package com.timberkito.cqytc.class01;

public class Demo01 {
    public static void main(String[] args) {
        // 下面的循环是使用*打印一个宽为5、高为3的矩形
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        // 下面的循环是使用*打印一个宽为4、高为4的正方形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
