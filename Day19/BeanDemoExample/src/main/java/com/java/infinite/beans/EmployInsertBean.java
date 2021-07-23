package com.java.infinite.beans;

import java.sql.SQLException;

public class EmployInsertBean {

	private int empno;
	private String name;
	private String dept;
	private String desig;
	private int basic;
	private String gender;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String addEmploy() throws ClassNotFoundException, SQLException {
		Emp emp =new Emp();
		emp.setEmpno(empno);
		emp.setName(name);
		emp.setGender(gender);
		emp.setDept(dept);
		emp.setDesig(desig);
		emp.setBasic(basic);
		return new EmployDAO().addEmploy(emp);
	}
}
