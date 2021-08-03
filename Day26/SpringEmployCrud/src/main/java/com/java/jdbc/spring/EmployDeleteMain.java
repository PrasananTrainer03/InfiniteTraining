package com.java.jdbc.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployDeleteMain {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/java/jdbc/spring/jdbc.xml");
		EmployDao dao = (EmployDao)ctx.getBean("employDao");
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		System.out.println(dao.deleteEmploy(empno));
	}
}
