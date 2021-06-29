package com.java.infinite.sup;

class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Hari extends Employ {

	public Hari(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class John extends Employ {
	public John(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

public class SupCon {

	public static void main(String[] args) {
		Employ obj1 = new Hari(1, "Hari", 88235);
		Employ obj2 = new John(3, "John", 67333);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
