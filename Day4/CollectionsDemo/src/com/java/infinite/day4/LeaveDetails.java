package com.java.infinite.day4;

import java.util.Date;

public class LeaveDetails {

	private int leaveId;
	private int empno;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private LeaveType leaveType;
	private LeaveStatus leaveStatus;
	private String leaveReason;

	
	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Date getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public LeaveDetails() {

	}

	public LeaveDetails(int leaveId, int empno, Date leaveStartDate, Date leaveEndDate, LeaveType leaveType,
			LeaveStatus leaveStatus, String leaveReason) {
		this.leaveId = leaveId;
		this.empno = empno;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
		this.leaveReason = leaveReason;
	}



	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", empno=" + empno + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus
				+ ", leaveReason=" + leaveReason + "]";
	}
	
	
	
	
}
