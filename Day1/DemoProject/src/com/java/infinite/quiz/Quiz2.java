package com.java.infinite.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		int x=12;
		int y = x++ + ++x + x++;
			// 12 + 14 + 14
		System.out.println(y);
	}
}
