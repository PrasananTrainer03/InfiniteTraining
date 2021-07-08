package org.me.junit.examples;

import java.util.Date;

public class LeaveDetails {

	private int leaveId;
	private int employId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String leaveReason;
	private String managerComments;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
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
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public String getManagerComments() {
		return managerComments;
	}
	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}
	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", employId=" + employId + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", leaveReason=" + leaveReason + ", managerComments="
				+ managerComments + "]";
	}
	public LeaveDetails(int leaveId, int employId, Date leaveStartDate, Date leaveEndDate, String leaveReason,
			String managerComments) {
		this.leaveId = leaveId;
		this.employId = employId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveReason = leaveReason;
		this.managerComments = managerComments;
	}
	public LeaveDetails() {
	}
	
	
}
