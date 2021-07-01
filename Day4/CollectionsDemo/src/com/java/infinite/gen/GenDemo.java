package com.java.infinite.gen;

class Data<T> {
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value  " +a+ " B value  " +b);
	}
}

public class GenDemo {
	public static void main(String[] args) {
		int a=12,b=15;
		String s1="Deepthi",s2="Bhagya";
		boolean b1=true,b2=false;
		Data obj = new Data();
		obj.swap(a, b);
		obj.swap(s1, s2);
		obj.swap(b1, b2);
	}
}
