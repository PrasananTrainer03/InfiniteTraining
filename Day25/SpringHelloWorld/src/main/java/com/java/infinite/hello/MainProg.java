package com.java.infinite.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/infinite/hello/bean.xml");
		HelloBean objKarthik = (HelloBean)ctx.getBean("beanKarthik");
		objKarthik.show("Karthik");
		
		HelloBean objSai = (HelloBean)ctx.getBean("beanSai");
		objSai.show("Sai Kumar M");
	}
}
