package com.java.infinite.multiple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/infinite/multiple/person.xml");
		Person objSunil = (Person)ctx.getBean("beanSunil");
		objSunil.showAll();
		
		Person objMalissa = (Person)ctx.getBean("beanMalissa");
		objMalissa.showAll();
	}
}
