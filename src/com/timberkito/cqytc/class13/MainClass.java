package com.timberkito.cqytc.class13;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People jack = new People();
		System.out.println("jack来给动物们投喂食物了!");
		System.out.print("jack给猴子投喂香蕉：");
		jack.feed(new Monkey(), new Banana());
		System.out.print("\njack给老虎投喂肉肉：");
		jack.feed(new Tiger(), new Meat());
		System.out.print("\njack给马儿投喂青草：");
		jack.feed(new Animal() {
			String animalName = "马儿";
			public void eat(Food food) {
				System.out.print(animalName + "正在吃");
				food.showFood();;
			}
		}, new Food() {
			String foodName = "青草";
			public void showFood() {		
				System.out.println(foodName);		
			}
		});
	}
}
