package com.timberkito.cqytc.class13;

public class Tiger implements Animal{
	String animalName = "老虎";
	public void eat(Food food) {
		System.out.print(animalName + "正在吃");
		food.showFood();;
	}
}
