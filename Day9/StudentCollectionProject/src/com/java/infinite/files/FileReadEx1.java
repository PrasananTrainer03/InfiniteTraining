package com.java.infinite.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx1 {

	public static void main(String[] args) {
		File f1 = new File("C:/Java_Infinite/Day5/StudentCollectionProject/src/com/java/infinite/student/Student.java");
		try {
			FileReader fr = new FileReader(f1);
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
