package org.me.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployCrud {

	public String insertEmploy(Employ objEmp) {
		Connection con=ConnectionHelper.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement("Insert into Employ1 values(?, ?, ?, ?, ?)");
			pst.setInt(1, objEmp.getEmpno());
			pst.setString(2, objEmp.getName()); 
			pst.setString(3, objEmp.getDept()); 
			pst.setString(4, objEmp.getDesig()); 
			pst.setInt(5, objEmp.getBasic()); 
			pst.executeUpdate();
			return "Record Inserted...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
	}
	public Employ searchEmploy(int empno) {
		Connection con=ConnectionHelper.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement("select * from Employ1 where empno=?");
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			Employ e = null;
			if(rs.next()) {
				e=new Employ();
				e.setEmpno(rs.getInt("empno"));
				e.setName(rs.getString("name")); 
				e.setDept(rs.getString("dept"));
				e.setDesig(rs.getString("desig")); 
				e.setBasic(rs.getInt("basic"));
			}
			return e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Employ[] showEmploy() {
		Connection con=ConnectionHelper.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement("select count(*) cnt from Employ1");
			ResultSet rs=pst.executeQuery();
			rs.next(); 
			int cnt=rs.getInt("cnt"); 
			Employ[] arr=new Employ[cnt]; 
			pst=con.prepareStatement("select * from Employ1"); 
			rs=pst.executeQuery();
			int i=0;
			Employ e=null;
			while(rs.next()) {
				e=new Employ();
				e.setEmpno(rs.getInt("empno"));
				e.setName(rs.getString("name"));
				e.setDept(rs.getString("dept"));
				e.setDesig(rs.getString("desig"));
				e.setBasic(rs.getInt("basic")); 
				arr[i]=e;
				i++;
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
