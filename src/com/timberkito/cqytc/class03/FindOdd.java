package com.timberkito.cqytc.class03;

public class FindOdd {
    public static void main(String[] args) {
        int[] number = {21, 5, 9, 14, 19, 35, 88, 95};
        for (int j : number) {
            if (j % 2 == 1) {
                System.out.println(j);
            }
        }
    }
}
