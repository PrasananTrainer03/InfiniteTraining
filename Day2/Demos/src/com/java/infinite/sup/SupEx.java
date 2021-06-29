package com.java.infinite.sup;

class First {
	void show() {
		System.out.println("Show Method from class first...");
	}
}

class Second extends First {
	void show() {
		super.show();
		System.out.println("Show Method from class Second...");
	}
}

public class SupEx {

	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
	}
}
