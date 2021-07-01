package com.java.infinite.day4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Hari");
		names.add("John");
		names.add("Lavanya");
		names.add("Deepthi");
		names.add("Sai Kumar");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2,"Malissa");
		System.out.println("Names after adding new Item");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(3, "Krishna");
		System.out.println("Names after editing  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove(1);
		System.out.println("List after removing by index");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Deepthi");
		System.out.println("List after removing by object name  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		System.out.println("Display with position  ");
		System.out.println(names.get(1));
	}
}
