package com.java.infinite.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaveMenu {

	static Scanner sc = new Scanner(System.in);
	
	static List employList;
	
	static {
		employList = new ArrayList();
	}
	
	public String addLeaveDetails() throws ParseException {
		LeaveDetails leaveDetails = new LeaveDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter LeaveId   ");
		leaveDetails.setLeaveId(sc.nextInt());
		System.out.println("Enter EmployId   ");
		leaveDetails.setEmpno(sc.nextInt());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Enter LeaveStartDate (yyyy-MM-dd)  ");
		leaveDetails.setLeaveStartDate(sdf.parse(sc.next()));
		System.out.println("Enter LeaveEndDate (yyyy-MM-dd)   ");
		leaveDetails.setLeaveEndDate(sdf.parse(sc.next()));
		System.out.println("Enter LeaveType (EL, PL, ML)  ");
		String type = sc.next();
		LeaveType leaveType=LeaveType.EL;
		if (type.equals("EL")) {
			leaveType = LeaveType.EL;
		}
		if (type.equals("PL")) {
			leaveType = LeaveType.PL;
		}
		if (type.equals("ML")) {
			leaveType = LeaveType.ML;
		}
		leaveDetails.setLeaveType(leaveType);
		
	//	System.out.println(leaveType);
		LeaveStatus leaveStatus = LeaveStatus.PENDING;
		leaveDetails.setLeaveStatus(leaveStatus);
		
		System.out.println("Enter Leave Reason   ");
		leaveDetails.setLeaveReason(sc.next());
		employList.add(leaveDetails);
		return "LeaveDetails Added Successfully...";
	}
	
	public void showLeaveDetails() {
		for (Object object : employList) {
			LeaveDetails leaveDetails = (LeaveDetails)object;
			System.out.println(leaveDetails);
		}
	}
	public void showMenu() throws ParseException {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. Add LeaveDetails ");
			System.out.println("2. Show LeaveDetails  ");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println(addLeaveDetails());
				break;
			case 2 : 
				showLeaveDetails();
				break;
			case 3 : 
				return;
			}
		} while(choice!=3);
		
	}
	
	public static void main(String[] args) {
		LeaveMenu menu = new LeaveMenu();
		try {
			menu.showMenu();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
