package com.java.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {

	@Id
	@Column(name="empno")
	private int empno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name="dept")
	private String dept;
	
	@Column(name="desig")
	private String desig;
	
	@Column(name="basic")
	private int basic;
	
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
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
	
	
}
