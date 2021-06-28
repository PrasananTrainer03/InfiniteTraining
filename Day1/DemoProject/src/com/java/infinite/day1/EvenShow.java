package com.java.infinite.day1;

public class EvenShow {

	public void show(int n) {
		int i=0;
		while(i < n) {
			i+=2;
			System.out.println("Even Number  " +i);
		}
	}
	public static void main(String[] args) {
		int n=20;
		EvenShow obj = new EvenShow();
		obj.show(n);
	}
}
