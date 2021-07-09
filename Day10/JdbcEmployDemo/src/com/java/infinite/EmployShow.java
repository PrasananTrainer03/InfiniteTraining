package com.java.infinite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice",
					"root","root");
			String cmd = "select * from Employ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(cmd);
			while(rs.next()) {
				System.out.println("Employ No   " +rs.getInt("empno"));
				System.out.println("Employ Name   " +rs.getString("name"));
				System.out.println("Department   " +rs.getString("dept"));
				System.out.println("Gender   " +rs.getString("gender"));
				System.out.println("Designation  " +rs.getString("desig"));
				System.out.println("Salary   " +rs.getInt("basic")); 
				System.out.println("-----------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
