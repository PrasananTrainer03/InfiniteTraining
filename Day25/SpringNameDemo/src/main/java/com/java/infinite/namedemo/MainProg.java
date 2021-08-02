package com.java.infinite.namedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/infinite/namedemo/name.xml");
		NameBean objJohn = (NameBean)ctx.getBean("beanJohn");
		System.out.println(objJohn.show());
		
		NameBean objNaresh = (NameBean)ctx.getBean("beanNaresh");
		System.out.println(objNaresh.show());
	}
}
