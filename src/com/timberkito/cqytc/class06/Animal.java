package com.timberkito.cqytc.class06;

public class Animal {
    private double weight;
    private String name;

    public Animal() {
    }

    public void show() {
        System.out.println("动物重量为：" + this.weight + "动物名字为：" + this.name);
    }

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
