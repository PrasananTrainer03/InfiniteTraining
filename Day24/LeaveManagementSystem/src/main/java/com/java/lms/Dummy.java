package com.java.lms;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Dummy {

	public static void main(String[] args) throws ParseException {
		LeaveDetails ld = new LeaveDetails();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date startDate = new java.sql.Date(sdf.parse("2020-12-12").getTime());
		java.sql.Date endDate = new java.sql.Date(sdf.parse("2020-12-14").getTime());
		ld.setLeaveStartDate(startDate);
		ld.setEmpId(2001);
		ld.setLeaveEndDate(endDate);
		try {
			System.out.println(new LeaveDetailsDAO().applyLeave(ld));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
