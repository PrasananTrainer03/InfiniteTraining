package com.java.infinite.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> lstStudent = null;
	
	static {
		lstStudent = new ArrayList<Student>();
	}
	
	public String readStudentFileDao() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("c:/files/student.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		lstStudent =(List<Student>)objin.readObject();
		objin.close();
		fin.close();
		return "Data Restored from File...";
	}
	public String writeStudentFileDao() throws IOException {
		FileOutputStream fout = new FileOutputStream("c:/files/student.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(lstStudent);
		objout.close();
		fout.close();
		return "File Created Successfully...";
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
