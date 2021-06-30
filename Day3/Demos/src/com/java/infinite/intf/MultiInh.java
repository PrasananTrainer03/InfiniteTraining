package com.java.infinite.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Bhagya implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is Bhagya@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Bhagya...");
	}
	
}
public class MultiInh {

}
