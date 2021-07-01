package com.java.infinite.day4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Karthik", 88235));
		employList.add(new Employ(3, "Sai Kumar", 55114));
		employList.add(new Employ(4, "Nandini", 99234));
		employList.add(new Employ(5, "John", 90234));
		
		System.out.println("Employ List is  ");
		for (Object ob : employList) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
