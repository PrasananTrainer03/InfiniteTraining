package com.java.infinite.day2;

public class ArrEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empno=1;
		e1.name="Sai Kumar";
		e1.basic=88235;
		
		Emp e2 = new Emp();
		e2.empno=3;
		e2.name="Karthik";
		e2.basic=82266;
		
		Emp e3 = new Emp();
		e3.empno=4;
		e3.name="Pavan";
		e3.basic=88166;
		
		Emp[] arrEmp = new Emp[3];
		arrEmp[0]=e1;
		arrEmp[1]=e2;
		arrEmp[2]=e3;
	//	arrEmp[3]=e4;
		
		for (Emp emp : arrEmp) {
			System.out.println(emp);
		}
	}
}
