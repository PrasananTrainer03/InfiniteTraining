package com.java.infinite.day4;

import java.util.Comparator;

public class BasicComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ e1 = (Employ)o1;
		Employ e2 = (Employ)o2;
		if (e1.basic >= e2.basic) {
			return 1;
		} else {
			return -1;
		}
	}

	
}
