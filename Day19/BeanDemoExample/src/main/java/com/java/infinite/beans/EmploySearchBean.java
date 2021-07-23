package com.java.infinite.beans;

import java.sql.SQLException;

public class EmploySearchBean {

	private int empno;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public Emp searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		return new EmployDAO().searchEmploy(empno);
	}
	
}
