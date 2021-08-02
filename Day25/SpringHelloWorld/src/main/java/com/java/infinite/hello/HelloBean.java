package com.java.infinite.hello;

public class HelloBean {

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public void show(String name) {
		System.out.println(greeting + " to " +name);
	}
	
}
