package com.java.lambda.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployListFilter {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Sai Kiran",98234));
		employList.add(new Employ(2,"Apparao",88992));
		employList.add(new Employ(3,"Malissa",91002));
		employList.add(new Employ(4,"Harish",92333));
		employList.add(new Employ(5,"Ashish",87999));
		employList.add(new Employ(7,"Ravali",85500));
		employList.add(new Employ(6,"Nandhini",90133));

		// Print all Employ Records whose Basic < 90000 
		
		Stream<Employ> employStream = employList.stream().filter(e -> e.getBasic() < 90000);
		
		employStream.forEach(x -> {
			System.out.println(x);
		});
		
		employStream = employList.stream().filter(e -> e.getBasic() >= 90000);
		System.out.println("Employ List whose Basic > 90000  ");
		System.out.println("-------------------");
		employStream.forEach(x -> {
			System.out.println(x);
		});
	}
}
