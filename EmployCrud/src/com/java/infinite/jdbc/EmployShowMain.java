package com.java.infinite.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployShowMain {

	public static void main(String[] args) {
		try {
			List<Employ> employList = new EmployDAO().showEmploy();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
