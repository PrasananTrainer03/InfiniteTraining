package com.java.infinite.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Employ result = searchEmploy(empno);
		if (result!=null) {
			String cmd = "delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Record Deleted...";
		}
		return "Record Not Found...";
	}
	
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Employ result = searchEmploy(employ.getEmpno());
		if (result!=null) {
			String cmd = "UPDATE EMPLOY SET Name=?, Gender= ?, Dept=?, Desig=?, Basic=? "
					+ " WHERE Empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, employ.getName());
			pst.setString(2, employ.getGender().toString());
			pst.setString(3, employ.getDept());
			pst.setString(4, employ.getDesig());
			pst.setDouble(5, employ.getBasic());
			pst.setInt(6, employ.getEmpno());
			pst.executeUpdate();
			return "Record Updated Successfully...";
		}
		return "Record Not Found...";
	}
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		String cmd = "INSERT INTO EMPLOY(Empno,Name,Gender,Dept,Desig,Basic) "
				+ "values(?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setDouble(6, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		String cmd = "select * from Employ where empno = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		String cmd = "select * from Employ";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}
}
