package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {

	Connection connection;
	PreparedStatement pst;
	
	public Employee searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee where emp_id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		if (rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobile(rs.getString("EMP_MOB_NO"));
			employee.setEmpDoj(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
		}
		return employee;
	}
	
	public Employee[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee";
		pst = connection.prepareStatement(cmd);
		List<Employee> employList = new ArrayList();
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobile(rs.getString("EMP_MOB_NO"));
			employee.setEmpDoj(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employList.add(employee);
			
		}
		return employList.toArray(new Employee[employList.size()]);
	}
}
