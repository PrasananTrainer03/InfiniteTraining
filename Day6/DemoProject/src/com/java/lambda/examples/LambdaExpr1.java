package com.java.lambda.examples;

interface IHello {
	void sayHello();
}

public class LambdaExpr1 {

	public static void main(String[] args) {
		
		IHello obj1 = () -> {
			System.out.println("Welcome to Lambda Expression...From Mani");
		};
		obj1.sayHello();
		
		IHello obj2 = () -> {
			System.out.println("HI I am Bhagya...Implementing Lambda Expression");
		};
		obj2.sayHello();
	}
}
