package com.java.infinite.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		int x = 12;
		int y = x++ + x++ + ++x + x-- + --x + --x + x++;
		     // 12 + 13 + 15 + 15 + 13 + 12 + 12
		System.out.println(y);
	}
}
