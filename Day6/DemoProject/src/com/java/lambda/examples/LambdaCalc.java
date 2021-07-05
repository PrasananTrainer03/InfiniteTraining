package com.java.lambda.examples;

interface ICalc {
	int calc(int a,int b);
}

public class LambdaCalc {

	public static void main(String[] args) {
		ICalc obj1 = (a,b) -> {
			return a+b;
		};
		System.out.println("Sum is   " +obj1.calc(12, 5));
		
		ICalc obj2 = (a,b) -> {
			return a-b;
		};
		System.out.println("Sub is  " +obj2.calc(12, 5));
		
		ICalc obj3 = (a,b) -> {
			return a*b;
		};
		System.out.println("Multiplication is  " +obj3.calc(12, 5));
	}
}
