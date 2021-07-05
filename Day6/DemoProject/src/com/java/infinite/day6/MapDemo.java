package com.java.infinite.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		Map data = new HashMap();
		data.put(1, "Ambika");
		data.put(2, "Deepthi");
		data.put(3, "John");
		data.put(4, "Sunil");
		data.put(5, "Pavan");
		
		Scanner sc = new Scanner(System.in);
		int sno;
		System.out.println("Enter Student No   ");
		sno = sc.nextInt();
		String result =(String)data.getOrDefault(sno, "Not Found");
		System.out.println(result);
	}
}
