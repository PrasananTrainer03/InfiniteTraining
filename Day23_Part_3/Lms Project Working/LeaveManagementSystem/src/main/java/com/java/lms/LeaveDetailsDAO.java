package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LeaveDetailsDAO {

	Connection connection;
	PreparedStatement pst;
	
	public LeaveDetails searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where LEAVE_ID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs = pst.executeQuery();
		LeaveDetails leaveDetails = null;
		if (rs.next()) {
			leaveDetails = new LeaveDetails();
			leaveDetails.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveDetails.setEmpId(rs.getInt("EMP_ID"));
			leaveDetails.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveDetails.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveDetails.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveDetails.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
			leaveDetails.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
			leaveDetails.setLeaveReason(rs.getString("LEAVE_REASON"));
			
		}
		return leaveDetails;
	}
	public String approveDeny(int leaveId, int mgrId, String managerComments, String status) throws ClassNotFoundException, SQLException {
		LeaveDetails ld = searchByLeaveId(leaveId);
		connection = ConnectionHelper.getConnection();
		Employee emp = new EmployeeDAO().searchEmploy(ld.getEmpId());
		if (mgrId==emp.getMgrId()) {
			if (status.toUpperCase().equals("YES")) {
				String cmd = "Update leave_history SET LEAVE_STATUS='APPROVED', "
						+ "LEAVE_MNGR_COMMENTS=? where LEAVE_ID=?";
				pst = connection.prepareStatement(cmd);
				pst.setString(1, managerComments);
				pst.setInt(2, leaveId);
				pst.executeUpdate();
				return "Your Leave Approved...";
			} else {
				return "Your Leave not Approved...";
			}
		} else {
			return "You Are unauthorized Manager...";
		}
	}
	public String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException {
		
		
		/*
		 * 1. LeaveStartDate cannot be greater than leave End Date
		 * 2. Balance must be available
		 */
		 long ms = leaveDetails.getLeaveEndDate().getTime() - leaveDetails.getLeaveStartDate().getTime();
		    long m = ms / (1000 * 24 * 60 * 60);
		    int days = (int) m;
		    days = days + 1;
		    leaveDetails.setLeaveType(LeaveType.EL);
		    leaveDetails.setLeaveStatus(LeaveStatus.PENDING);
		    System.out.println("Difference is " + days);
		    Employee employee = new EmployeeDAO().searchEmploy(leaveDetails.getEmpId());
		    int leaveBalance = employee.getLeaveAvail();
		   // System.out.println("Balance is  " +employee.getLeaveAvail());
		    if (days < 0) {
		    	return "Leave-Start Date Cannot be Greater than leave-End Date...";
		    } else if (leaveBalance-days < 0) {
		    	return "Insufficient Leave Balance...";
		    } else {
		    	int diff = leaveBalance-days;
		    	leaveDetails.setNoOfDays(days);
		    	connection = ConnectionHelper.getConnection();
		    	String cmd = "Insert into LEAVE_HISTORY(Emp_ID,Leave_Start_Date, "
		    			+ "Leave_End_Date,Leave_Type,Leave_Status,Leave_Reason,LEAVE_NO_OF_DAYS) "
		    			+ "VALUES(?,?,?,?,?,?,?)";
		    	pst = connection.prepareStatement(cmd);
		    	pst.setInt(1, leaveDetails.getEmpId());
		    	pst.setDate(2, leaveDetails.getLeaveStartDate());
		    	pst.setDate(3, leaveDetails.getLeaveEndDate());
		    	pst.setString(4, leaveDetails.getLeaveType().toString());
		    	pst.setString(5, leaveDetails.getLeaveStatus().toString());
		    	pst.setString(6, leaveDetails.getLeaveReason());
		    	pst.setInt(7, leaveDetails.getNoOfDays());
		    	pst.executeUpdate();
		    	cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL=? WHERE EMP_ID=?";
		    	pst = connection.prepareStatement(cmd);
		    	pst.setInt(1, diff);
		    	pst.setInt(2, leaveDetails.getEmpId());
		    	pst.executeUpdate();
		    	return "Leave Applied Successfully...";
		    }
		//    return "NULL";
	}
}
