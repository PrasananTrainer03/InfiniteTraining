package com.java.infinite.day4;

public class Emp {

	private int empno;
	private String name;
	private double basic;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public Emp() {

	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
