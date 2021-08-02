package com.java.infinite.trainer;

import java.util.List;

public class Trainer {

	private String trainerName;
	private String location;
	private List<Student> studentList;
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void showInfo() {
		System.out.println("Trainer Name  " +trainerName);
		System.out.println("Location  " +location);
		System.out.println("Stdents  ");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
