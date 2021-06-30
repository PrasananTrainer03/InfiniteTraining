package com.java.infinite.enums;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Test {

	public static void main(String[] args) {
		WeekDays wk = WeekDays.SUNDAY;
		System.out.println(wk);
	}
}
