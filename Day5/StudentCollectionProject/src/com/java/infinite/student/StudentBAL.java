package com.java.infinite.student;

import java.util.List;

public class StudentBAL {

	static StringBuilder sb = new StringBuilder();
	
	public String deleteStudentBal(int sno) {
		return new StudentDAO().deleteStudentDao(sno);
	}
	public Student searchStudentBal(int sno) {
		return new StudentDAO().searchStudentDao(sno);
	}
	public List<Student> showStudentBal() {
		return new StudentDAO().showStudentDao();
	}
	 
	public String updateStudentBal(Student student) throws StudentException {
		if (validateStudent(student)==false) {
			throw new StudentException(sb.toString());
		} else {
			StudentDAO dao = new StudentDAO();
			return dao.updateStudentDao(student);
		}
	}
	public String addStudentBal(Student student) throws StudentException {
		if (validateStudent(student)==false) {
			throw new StudentException(sb.toString());
		} else {
			StudentDAO dao = new StudentDAO();
			return dao.addStudentDao(student);
		}
	}
	public boolean validateStudent(Student student) {
		boolean isAdded = true;
		if (student.getSno() <= 0) {
			isAdded = false;
			sb.append("Student No Must be Greater than Zero\r\n");
		}
		if (student.getName().length() < 5) {
			isAdded = false;
			sb.append("Student Name contains min. 5 characters \r\n");
		}
		if (student.getCity().length() < 5) {
			isAdded = false;
			sb.append("Student City Contains min. 5 characters \r\n");
		}
		if (student.getCgp() <= 0) {
			isAdded=false;
			sb.append("Cgp Cannot be Zero or Negative \r\n");
		}
		return isAdded;
	}
}
