package com.java.infinite.day1;

public class CaseDemo2 {

	public void show(String month) {
		switch(month) {
		case "Jan" :
			System.out.println("Its January...");
			break;
		case "Feb" :
			System.out.println("Its February...");
			break;
		case "Mar" :
			System.out.println("Its March...");
			break;
		case "Apr" :
			System.out.println("Its April...");
			break;
		case "May" :
			System.out.println("Its May...");
			break;
		case "June" :
			System.out.println("Its June...");
			break;
		case "July" :
			System.out.println("Its July...");
			break;
		case "Aug" :
			System.out.println("Its August...");
			break;
		case "Sep" :
			System.out.println("Its September...");
			break;
		case "Oct" :
			System.out.println("Its October...");
			break;
		case "Nov" :
			System.out.println("Its November...");
			break;
		case "Dec" :
			System.out.println("Its December...");
			break;
		default :
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		String month="Mar";
		CaseDemo2 obj = new CaseDemo2();
		obj.show(month);
	}
}
