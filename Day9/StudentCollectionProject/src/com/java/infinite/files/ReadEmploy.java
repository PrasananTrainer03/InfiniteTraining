package com.java.infinite.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/files/employ.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			Employ employ = (Employ)objin.readObject();
			System.out.println(employ);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
