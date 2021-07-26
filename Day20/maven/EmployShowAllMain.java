package com.java.infinite.maven;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployShowAllMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployDAO dao = new EmployDAO();
		try {
			Employ[] employs = dao.showEmploy();
			for (Employ employ : employs) {
				System.out.println("Employ No   " +employ.getEmpno());
				System.out.println("Employ Name   " +employ.getName());
				System.out.println("Department   " +employ.getDept());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
