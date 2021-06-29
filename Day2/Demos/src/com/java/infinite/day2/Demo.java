package com.java.infinite.day2;

public class Demo {

	int n;
	
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		obj1.n=12;
		Demo obj2 = obj1;
		obj2.n=13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
