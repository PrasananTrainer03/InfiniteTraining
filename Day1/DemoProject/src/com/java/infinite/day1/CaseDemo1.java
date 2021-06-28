package com.java.infinite.day1;

public class CaseDemo1 {

	public void show(int no) {
		switch(no) {
		case 1 : 
			System.out.println("Hi I am Ambika...");
			break;
		case 2 :
			System.out.println("Hi I am Bhagya...");
			break;
		case 3 : 
			System.out.println("Hi I am Harish...");
			break;
		case 4 :
			System.out.println("Hi I am Krishna...");
			break;
		case 5 : 
			System.out.println("HI I am Pavan...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int no=8;
		CaseDemo1 obj = new CaseDemo1();
		obj.show(no);
	}
}
