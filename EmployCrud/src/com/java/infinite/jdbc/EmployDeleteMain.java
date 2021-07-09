package com.java.infinite.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		int empno = sc.nextInt();
		try {
			String result = new EmployDAO().deleteEmploy(empno);
			System.out.println(result);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
