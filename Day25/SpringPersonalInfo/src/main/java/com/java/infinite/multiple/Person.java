package com.java.infinite.multiple;

public class Person {

	private int id;
	private String name;
	private JobDetails jobDetails;
	private Family familyDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JobDetails getJobDetails() {
		return jobDetails;
	}
	public void setJobDetails(JobDetails jobDetails) {
		this.jobDetails = jobDetails;
	}
	public Family getFamilyDetails() {
		return familyDetails;
	}
	public void setFamilyDetails(Family familyDetails) {
		this.familyDetails = familyDetails;
	}
	
	public void showAll() {
		System.out.println("id  " +id + " Name  " +name);
		jobDetails.showJobInfo();
		familyDetails.showFamily();
	}
}
