package com.java.infinite.day4;

public class Employ {

	int empno;
	String name;
	double basic;
	
	
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}


	public Employ() {

	}


	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	
}
