package com.java.infinite.day6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {

	public static void main(String[] args) {
		Map<Integer, String> data = new Hashtable<Integer, String>();
		data.put(1, "Karthik");
		data.put(2, "Nandhini");
		data.put(3, "Lavanya");
		data.put(4, "Naresh");
		data.put(5, "Rahul");
		int sno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sno   ");
		sno = sc.nextInt();
		String result = data.getOrDefault(sno, "Not Found");
		System.out.println(result);
	}
}
