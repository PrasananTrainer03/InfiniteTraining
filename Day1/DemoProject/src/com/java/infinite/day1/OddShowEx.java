package com.java.infinite.day1;

public class OddShowEx {

	public void show(int n) {
		for(int i=1;i<n;i+=2) {
			System.out.println("Odd  " +i);
		}
	}
	public static void main(String[] args) {
		int n=20;
		OddShowEx obj = new OddShowEx();
		obj.show(n);
	}
}
