package com.java.infinite.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> lstStudent = null;
	
	static {
		lstStudent = new ArrayList<Student>();
	}
	
	public String updateStudentDao(Student student) {
		Student result = searchStudentDao(student.getSno());
		if (result!=null) {
			result.setSno(student.getSno());
			result.setName(student.getName());
			result.setCity(student.getCity());
			result.setCgp(student.getCgp());
			return "Record Updated Successfully...";
		}
		return "Student Record Not Found...";
	}
	public String deleteStudentDao(int sno) {
		Student result = searchStudentDao(sno);
		if (result!=null) {
			lstStudent.remove(result);
			return "Student Record Deleted...";
		} else {
			return "Student Record Not Found...";
		}
	}
	public Student searchStudentDao(int sno) {
		Student result = null;
		for (Student student : lstStudent) {
			if (sno==student.getSno()) {
				result = student;
			}
		}
		return result;
	}
	
	public List<Student> showStudentDao() {
		return lstStudent;
	}
	
	public String addStudentDao(Student student) {
		lstStudent.add(student);
		return "Student Added Successfully...";
	}
}
