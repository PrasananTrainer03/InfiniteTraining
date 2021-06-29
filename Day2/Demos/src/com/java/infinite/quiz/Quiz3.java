package com.java.infinite.quiz;

public class Quiz3 {

	public void check(Object ob) {
		if (ob=="xyz") {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
	}
	public static void main(String[] args) {
		String s="xyz";
		new Quiz3().check(s);
	}
}
