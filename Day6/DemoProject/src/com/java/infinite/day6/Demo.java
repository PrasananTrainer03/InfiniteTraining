package com.java.infinite.day6;

public class Demo {

	public static void main(String[] args) {
		String s1="Naresh",s2="Naresh";
		String s3 = new String("Naresh");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
