package com.java.infinite.day6;

public class EmployTest {

	public static void main(String[] args) {
		Employ emp1 = new Employ(1, "Rahul", 99111);
		Employ emp2 = new Employ(3, "Saikiran",99111);
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
	}
}
