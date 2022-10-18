package com.timberkito.cqytc.class03;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;
        System.out.println("请输入一个数:");
        number = sc.nextLong();
        long x = test(number);
        while(number<1) {
            System.out.println("请输入一个大于1且小于999的整数");
            number=sc.nextLong();
        }
        if (x==number) {
            System.out.println(number+"是回文数");
        }
        else {
            System.out.println("抱歉"+number+"不是回文数");
        }
    }

    public static long test(Long number) {    //判断过程
        long sum =0;
        while(number>0) {
            sum = sum*10+number%10;
            number=number/10;
        }
        return sum;
    }
}
