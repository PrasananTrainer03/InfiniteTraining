package com.java.infinite.day4;

import java.util.Scanner;

public class ReadEmp {

	public static void main(String[] args) {
		Emp emp = new Emp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		emp.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		emp.setName(sc.next());
		System.out.println("Enter Basic   ");
		emp.setBasic(sc.nextDouble());
		
		System.out.println("Employ No   " +emp.getEmpno());
		System.out.println("Employ Name  " +emp.getName());
		System.out.println("Salary   " +emp.getBasic());
	}
}
