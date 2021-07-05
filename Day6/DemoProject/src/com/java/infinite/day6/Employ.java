package com.java.infinite.day6;

public class Employ {

	private int empno;
	private String name;
	private double basic;
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basic);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		Employ employ = (Employ) obj;
		if (employ.basic==basic) {
			return true;
 		}
		return false;
	}


	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}


	public Employ() {
		// TODO Auto-generated constructor stub
	}


	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	
}
