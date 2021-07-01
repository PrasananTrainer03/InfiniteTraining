package com.java.infinite.day4;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ e1 = (Employ)o1;
		Employ e2 = (Employ)o2;
		return e2.name.compareTo(e1.name);
	}

	
}
