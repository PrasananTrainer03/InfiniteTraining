package com.java.infinite.cons;

public class ConEx {

	static {
		System.out.println("Static Constructor...");
	}
	
	ConEx() {
		System.out.println("Instance Constructor...");
	}
	
	public static void main(String[] args) {
		ConEx obj = new ConEx();
	}
}
