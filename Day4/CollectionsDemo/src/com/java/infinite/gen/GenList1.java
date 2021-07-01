package com.java.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add(new String("Sai Kiran"));
		names.add(new String("Sravani Gorle"));
		names.add(new String("Yashik"));
		names.add(new String("Naresh"));
		names.add(new String("Nandhini"));
		
		for (String s : names) {
			System.out.println(s);
		}
		//names.add(12);
	}
}
