package com.java.infinite.enums;

enum LeaveStatus {
	PENDING, APPROVED, REJECTED
}

public class Enum2 {

	public static void main(String[] args) {
		String status = "PENDING";
		LeaveStatus lstatus = LeaveStatus.valueOf(status);
		System.out.println(lstatus);
	}
}
