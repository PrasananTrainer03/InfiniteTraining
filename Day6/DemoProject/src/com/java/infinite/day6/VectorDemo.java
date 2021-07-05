package com.java.infinite.day6;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> names = new Vector<String>(3, 2);
		System.out.println("Size   " +names.size());
		System.out.println("Capacity   " +names.capacity());
		names.addElement("Malissa");
		names.addElement("Nandhini");
		System.out.println("Size   " +names.size());
		System.out.println("Capacity   " +names.capacity());
		names.addElement("Rahul");
		System.out.println("Size   " +names.size());
		System.out.println("Capacity   " +names.capacity());
		names.addElement("Krishna");
		System.out.println("Size   " +names.size());
		System.out.println("Capacity   " +names.capacity());

	}
}
