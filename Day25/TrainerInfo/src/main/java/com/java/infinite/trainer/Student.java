package com.java.infinite.trainer;

public class Student {

	private int sno;
	private String firstName;
	private String lastName;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
