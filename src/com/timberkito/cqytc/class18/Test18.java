package com.timberkito.cqytc.class18;
import java.util.Random;
import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		Latter latter = new Latter();  // 作为桥梁，用于显示字符和输入字符的比较
		Display displayChar = new Display();
		Type typeChar = new Type();	
		
		displayChar.setLatter(latter);   // 连接桥梁
		displayChar.setSleepTime(5000);
		typeChar.setLatter(latter);     // 连接桥梁
		
		Thread a = new Thread(displayChar);	 // 创建显示的线程
		Thread b = new Thread(typeChar);	 // 创建打字的线程	
		typeChar.setThread(a);
		a.start(); // 启动线程
		b.start();
	}
}

// 字符类
class Latter{
	char c = '\0';
	void setChar(char c) {
		this.c = c;
	}
	char getChar() {
		return this.c;
	}
}

class Display implements Runnable{	
	Random a = new Random();
	int sleepTime = 0;
	Latter latter;
	// 与Latter建立连接
	void setLatter(Latter latter) {
		this.latter = latter;
	}
	void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	public void run() {
		while(true){			
			int rand = (int)a.nextInt(27); 
			char c = (char)(97+rand);  // 产生随机字符
			latter.setChar(c);
			System.out.println("显示的字符为：" + c);			
			try {
				Thread.sleep(sleepTime);
			}
			catch(InterruptedException e) {
			}
		}
	}	
}

class Type implements Runnable{
	Scanner input = new Scanner(System.in);
	int score = 0;
	Latter latter;
	Thread thread;
	// 与Latter建立连接
	void setLatter(Latter latter) {
		this.latter = latter;		
	}	
	void setThread(Thread thread) {
		this.thread = thread;
	}
	public void run() {
		while(true) {
			String str = input.nextLine();
			char getChar = str.charAt(0);
			if(getChar == '#') {
				System.exit(0);
			}
			if(getChar == latter.getChar()) {
				score++;
				System.out.println("输入正确，当前分数："+ score);
				thread.interrupt();
			}
			else {
				System.out.println("输入错误，不得分。");
				thread.interrupt();
			}	
		}
	}
}