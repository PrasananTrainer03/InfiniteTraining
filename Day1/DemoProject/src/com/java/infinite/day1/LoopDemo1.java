package com.java.infinite.day1;

public class LoopDemo1 {

	public void show(int n) {
		int i=0;
		while(i < n) {
			System.out.println("Hi I am Harish...");
			i++;
		}
	}
	public static void main(String[] args) {
		int n=5;
		LoopDemo1 obj = new LoopDemo1();
		obj.show(n);
	}
}
