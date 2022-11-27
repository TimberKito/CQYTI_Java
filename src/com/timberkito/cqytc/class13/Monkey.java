package com.timberkito.cqytc.class13;


public class Monkey implements Animal {
    String animalName = "猴子";

    public void eat(Food food) {
        System.out.print(animalName + "正在吃");
        food.showFood();
    }
}
