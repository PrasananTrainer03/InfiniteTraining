package com.java.infinite.day1;

public class Calc {

	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("Sum of "+a+ " and " +b+   " is  " +c);
	}
	public static void main(String[] args) {
		int a,b;
		a=15;
		b=74;
		Calc obj = new Calc();
		obj.sum(a, b);
	}
}
