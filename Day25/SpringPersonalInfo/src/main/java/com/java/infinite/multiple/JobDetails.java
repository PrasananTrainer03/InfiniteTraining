package com.java.infinite.multiple;

public class JobDetails {

	private String job;
	private String company;
	private String location;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void showJobInfo() {
		System.out.println("Job " +job);
		System.out.println("Company  " +company);
		System.out.println("Location  " +location);
	}
}
