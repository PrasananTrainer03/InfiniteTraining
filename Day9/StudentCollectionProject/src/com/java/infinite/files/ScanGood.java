package com.java.infinite.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScanGood {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/files/student.txt");
			fw.write("12 sunil sandhya true 15 15.2 false naresh rama 51 56 1.5 19 pavan sai");
			fw.close();
			FileReader fr =new FileReader("c:/files/student.txt");
			Scanner sc = new Scanner(fr);
			while(sc.hasNext()) {
				if (sc.hasNextInt()) {
					System.out.println(sc.nextInt());
				} else {
					sc.next();
				}
			}
			sc.close();
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
