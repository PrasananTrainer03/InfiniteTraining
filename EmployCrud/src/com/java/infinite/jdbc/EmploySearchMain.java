package com.java.infinite.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		try {
			Employ result= new EmployDAO().searchEmploy(empno);
			if (result!=null) {
				System.out.println(result);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
