package com.java.infinite.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream src = 
					new FileInputStream("C:/Java_Infinite/Day5/StudentCollectionProject/src/com/java/infinite/student/Student.java");
			FileOutputStream tar = new FileOutputStream("c:/files/StudentNew.java");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			src.close();
			tar.close();
			System.out.println("*** File Copied Successfully ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
