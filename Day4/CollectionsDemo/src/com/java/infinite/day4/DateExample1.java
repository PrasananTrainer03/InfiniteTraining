package com.java.infinite.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println("Today's Date  " +obj);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Formatted String is  " +sdf.format(obj));
	}
}
