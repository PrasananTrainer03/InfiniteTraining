package com.java.jdbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowAll {

	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("com/java/jdbc/spring/jdbc.xml");
		EmployDao dao = (EmployDao)ctx.getBean("employDao");
		Employ[] employList = dao.showEmploy();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
