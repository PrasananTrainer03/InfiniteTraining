package com.java.infinite.enums;

public class VarArgsDemo {

	void show(String...name) {
		for (String s : name) {
			System.out.print(s + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgsDemo obj = new VarArgsDemo();
		obj.show();
		obj.show("Deepthi");
		obj.show("Bhagya","Harish");
		obj.show("John","Karthik","Lavanya");
	}
}
