package com.java.infinite.cons;

public class ArrEmploy {

	public static void main(String[] args) {
		Employ[] arrEmploy = new Employ[] {
			new Employ(1, "Hari", 78345),
			new Employ(3, "Deepthi", 90235),
			new Employ(4, "John", 90244),
			new Employ(5, "Sai Kumar", 89234)
		};
		
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
