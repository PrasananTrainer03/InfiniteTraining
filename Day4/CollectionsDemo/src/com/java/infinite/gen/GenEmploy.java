package com.java.infinite.gen;

import java.util.ArrayList;
import java.util.List;


public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Karthik", 88235));
		employList.add(new Employ(3, "Sai Kumar", 55114));
		employList.add(new Employ(4, "Nandini", 99234));
		employList.add(new Employ(5, "John", 90234));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
