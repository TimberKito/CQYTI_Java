package com.timberkito.cqytc.class11;

public class MainClass {
    public static void main(String[] args) {
        double[] player = {9.21, 8.53, 8.65, 9.50, 9.88, 8.76, 9.46, 9.78};
        double[] grade = {80.5, 88, 98.5, 99, 78, 88, 85, 81.5, 92.5};
        School school = new School();
        Gymnastics gymnastics = new Gymnastics();
        System.out.println("体操选手成绩为:" + gymnastics.average(player));
        System.out.println("班级平均成绩为:" + school.average(grade));
    }
}
