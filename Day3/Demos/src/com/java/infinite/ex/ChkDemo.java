package com.java.infinite.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChkDemo {

	public void show() throws ParseException {
		Date obj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String str = sdf.format(obj);
		System.out.println(str);
		String s1="12-25-2021";
		Date dt = sdf.parse(s1);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		try {
			new ChkDemo().show();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
