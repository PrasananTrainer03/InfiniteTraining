package com.java.infinite.day1;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You are Elligible for Voting...");
		} else {
			System.out.println("You are not Elligible for Voting...");
		}
	}
	public static void main(String[] args) {
		int age=17;
		Voting obj = new Voting();
		obj.check(age);
	}
}
