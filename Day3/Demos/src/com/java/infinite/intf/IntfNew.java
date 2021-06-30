package com.java.infinite.intf;

interface IDemo {
	String company = "Infinite";
	String trainer = "Prasanna";
}

class Emp implements IDemo {
	
	public void show() {
	//	company = "HCL";
		System.out.println("Company is  " +company);
		System.out.println("Trainer is  " +trainer);
	}
}
public class IntfNew {
	
	public static void main(String[] args) {
		Emp obj = new Emp();
		obj.show();
	}
}
