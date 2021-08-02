package com.java.infinite.multiple;

public class Family {

	private String city;
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void showFamily() {
		System.out.println("City  " +city);
		System.out.println("State  " +state);
	}
	
}
