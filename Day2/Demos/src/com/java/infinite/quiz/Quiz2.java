package com.java.infinite.quiz;

public class Quiz2 {
	
	public void show(Object x) {
		System.out.println("Show Method w.r.t. Object " +x);
	}
	
	public void show(double x) {
		System.out.println("Show Method w.r.t. double " +x);
	}
	
	public static void main(String[] args) {
		Quiz2 obj = new Quiz2();
		obj.show(12);
	}
}
