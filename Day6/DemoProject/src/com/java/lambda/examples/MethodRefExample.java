package com.java.lambda.examples;

interface IGreeting {
	void greet();
}
public class MethodRefExample {

	void saluation() {
		System.out.println("Good Morining...From Prasanna");
	}
	
	public static void main(String[] args) {
//		IGreeting g1 = () -> {
//			System.out.println("Good Morning...From Prasanna");
//		};
//		g1.greet();
		
		IGreeting obj1 = new MethodRefExample()::saluation;
		obj1.greet();
	}
}
