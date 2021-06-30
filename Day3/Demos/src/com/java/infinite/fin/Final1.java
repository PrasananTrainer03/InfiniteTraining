package com.java.infinite.fin;

final class Test1 {
	void show() {
		System.out.println("Hello...");
	}
}

//class Harish extends Test1 {
//	
//} // throws error as final class cannot be inherited

public class Final1 {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.show();
	}
}
