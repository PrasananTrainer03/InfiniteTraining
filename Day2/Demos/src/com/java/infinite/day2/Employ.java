package com.java.infinite.day2;

public class Employ {

	int empno;
	String name;
	double basic;

	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}


	public static void main(String[] args) {
		Employ objEmploy1 = new Employ();
		objEmploy1.empno=5;
		objEmploy1.name="Murari";
		objEmploy1.basic=88235;
		
		System.out.println(objEmploy1);
	}
}
