package com.java.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Nandhini", 98234));
		employList.add(new Employ(12, "Sai Kumar", 89234));
		employList.add(new Employ(3, "Abhishek", 77332));
		employList.add(new Employ(14, "Bhagya", 89023));
		employList.add(new Employ(6, "Rahul", 79088));
		employList.add(new Employ(5, "Malissa", 91223));
		employList.add(new Employ(13, "Lavanya", 78235));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
