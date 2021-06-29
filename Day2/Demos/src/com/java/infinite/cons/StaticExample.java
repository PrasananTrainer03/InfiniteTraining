package com.java.infinite.cons;

public class StaticExample {

	static int score;
	public void increment() {
		score++;
	}
	
	public void show() {
		System.out.println("Score is  " +score);
	}
	
	public static void main(String[] args) {
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		StaticExample obj3 = new StaticExample();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
		obj3.show();
	}
}
