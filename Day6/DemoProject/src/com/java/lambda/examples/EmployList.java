package com.java.lambda.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployList {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Sai Kiran",98234));
		employList.add(new Employ(2,"Apparao",88992));
		employList.add(new Employ(3,"Malissa",91002));
		employList.add(new Employ(4,"Harish",92333));
		employList.add(new Employ(5,"Ashish",87999));
		employList.add(new Employ(7,"Ravali",85500));
		employList.add(new Employ(6,"Nandhini",90133));
		
		 Collections.sort(employList,(p1,p2)->{
	        	return p1.getName().compareTo(p2.getName());
	        });
		
		System.out.println("Employ List  ");
		employList.forEach(employ -> {
			System.out.println(employ);
		});
		
		Collections.sort(employList,(p1,p2)->{
			return (int) (p1.getBasic() - p2.getBasic());
        });
		
		System.out.println("Sort w.r.t. Basic-Wise  ");
		employList.forEach(employ -> {
			System.out.println(employ);
		});
	}
}
