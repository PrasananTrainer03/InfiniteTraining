package com.java.infinite.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Custom {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name   ");
		try {
			String name = br.readLine();
			System.out.println("Name is  " +name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
