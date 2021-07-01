package com.java.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenIntDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(22));
		numbers.add(new Integer(11));
		numbers.add(new Integer(90));
		numbers.add(new Integer(19));
		int sum=0;
		for (Integer i : numbers) {
			sum+=i;
		}
		System.out.println("Sum is   " +sum);
		//numbers.add("abc");
		//numbers.add(new )
	}
}
