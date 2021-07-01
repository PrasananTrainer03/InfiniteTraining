package com.java.infinite.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LeaveDetailsMain {

	public void show() throws ParseException {
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
		LeaveType leaveType;
		if (type.equals("EL")) {
			leaveType = LeaveType.EL;
		}
		if (type.equals("PL")) {
			leaveType = LeaveType.PL;
		}
		if (type.equals("ML")) {
			leaveType = LeaveType.ML;
		}
		
		LeaveStatus leaveStatus = LeaveStatus.PENDING;
		System.out.println("Enter Leave Reason   ");
		leaveDetails.setLeaveReason(sc.next());
		System.out.println("Printing Details   ");
		System.out.println(leaveDetails);
	}
	public static void main(String[] args) {
		LeaveDetailsMain obj = new LeaveDetailsMain();
		try {
			obj.show();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
