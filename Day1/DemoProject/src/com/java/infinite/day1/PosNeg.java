package com.java.infinite.day1;

public class PosNeg {

	public void check(int n) {
		if (n >= 0) {
			System.out.println("Positive Number...");
		} else {
			System.out.println("Negative Number...");
		}
	}
	public static void main(String[] args) {
		int n=-5;
		PosNeg obj = new PosNeg();
		obj.check(n);
	}
}
