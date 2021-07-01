package com.java.infinite.day4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Rahul");
		names.add("Naresh");
		names.add("John");
		names.add("Pavan");
		names.add("Harish");
		names.add("Hari");
		
		System.out.println("Sorted Data  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
