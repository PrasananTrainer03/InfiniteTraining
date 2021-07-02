package com.java.infinite.files;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		File f1 = new File("C:/Java_Infinite/Day5/StudentCollectionProject/src/com/java/infinite/student/Student.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Full Name  " +f1.getPath());
		System.out.println("Parent Directory  " +f1.getParent());
	}
}
