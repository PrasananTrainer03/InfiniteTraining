package com.java.infinite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		int empno = sc.nextInt();
		System.out.println("Enter Employ Name  ");
		String name = sc.next();
		System.out.println("Enter Gender  ");
		String gen = sc.next();
		Gender gender = null;
		if (gen.toUpperCase().equals("MALE")) {
			gender=Gender.MALE;
		}
		if (gen.toUpperCase().equals("FEMALE")) {
			gender = Gender.FEMALE;
		}
		System.out.println("Enter Department   ");
		String dept = sc.next();
		System.out.println("Enter Designation   ");
		String desig = sc.next();
		System.out.println("Enter Basic   ");
		double basic = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice",
					"root","root");
			String cmd = "INSERT INTO EMPLOY(Empno,Name,Gender,Dept,Desig,Basic) "
					+ "values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setString(3, gender.toString());
			pst.setString(4, dept);
			pst.setString(5, desig);
			pst.setDouble(6, basic);
			pst.executeUpdate();
			System.out.println("*** Record Inserted ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
