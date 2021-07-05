package com.java.lambda.examples;

import java.util.ArrayList;
import java.util.List;

public class LamdaShow {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Mani");
		names.add("Ravali");
		names.add("Manoj");
		names.add("Bhagya");
		names.add("Sunil");
		names.add("Karthik");
		names.add("Krishna");
//		for (String s : names) {
//			System.out.println(s);
//		}
		names.forEach(x -> {
			System.out.println(x);
		});
	}
}
