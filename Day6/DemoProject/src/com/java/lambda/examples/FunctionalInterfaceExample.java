package com.java.lambda.examples;

@FunctionalInterface
interface ITest {
	double calc(double c);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		ITest obj1 = (c) -> {
			return c+273;
		};
		System.out.println("Kelvin value is  " +obj1.calc(37));
		
		ITest obj2 = (c) -> {
			double f = ((9*c)/5)+32;
			return f;
		};
		System.out.println("Fahrenheit Value is  " +obj2.calc(37));
	}
	
	

}
