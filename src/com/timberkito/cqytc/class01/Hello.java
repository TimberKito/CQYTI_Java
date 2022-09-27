package com.timberkito.cqytc.class01;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student student = new Student();
        student.speak("王麒皓2022231870");
    }
}

class Student {
    public void speak(String s) {
        System.out.println(s);
    }
}