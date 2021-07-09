package com.java.infinite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		int empno = sc.nextInt();
		System.out.println("Enter Designation  ");
		String desig = sc.next();
		System.out.println("Enter Basic   ");
		double basic = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice",
					"root","root");
			String cmd = "UPDATE EMPLOY SET DESIG=?, BASIC=? WHERE Empno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, desig);
			pst.setDouble(2, basic);
			pst.setInt(3, empno);
			pst.executeUpdate();
			System.out.println("*** Record Updated ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
