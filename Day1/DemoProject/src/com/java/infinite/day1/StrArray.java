package com.java.infinite.day1;

public class StrArray {

	public void show() {
		String[] names = new String[] {
			"Bhavya","Ashish",
			"Hari", "Harish",
			"John","Deepthi"
		};
		
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StrArray obj = new StrArray();
		obj.show();
	}
}
