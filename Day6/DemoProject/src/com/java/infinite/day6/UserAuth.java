package com.java.infinite.day6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Krishna", "Kanth");
		userData.put("Lavanya", "Sidharthan");
		userData.put("Karthik", "Mestha");
		userData.put("SaiKian", "Reddy");
		userData.put("Sunil", "Kallepalli");
		String user,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName   ");
		user = sc.next();
		System.out.println("Enter Password   ");
		pwd = sc.next();
		
		String result = userData.getOrDefault(user, "Not Found");
		if (pwd.equals(result)) {
			System.out.println("*** Correct Credentials ***");
		} else {
			System.out.println("*** Invalid Credentials ***");
		}
	}
}
