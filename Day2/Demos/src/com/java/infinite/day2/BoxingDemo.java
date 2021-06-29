package com.java.infinite.day2;

public class BoxingDemo {

	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name="Deepthi";
		
		/* Boxing Demo */
		Object ob1=x;
		Object ob2=y;
		Object ob3=name;
		
		int x1 = (Integer)ob1;
		double y1 = (Double)ob2;
		String s1 = (String)ob3;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(s1);
	}
}
