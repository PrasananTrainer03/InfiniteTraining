package com.java.infinite.quiz;

public class Quiz1 {

	public void show(int x) {
		System.out.println("Show Method w.r.t. int " +x);
	}
	
	public void show(Object x) {
		System.out.println("Show Method w.r.t. Object " +x);
	}
	
	public static void main(String[] args) {
		Quiz1 obj = new Quiz1();
		obj.show(12);
	}
}
