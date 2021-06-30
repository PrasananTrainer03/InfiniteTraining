package com.java.infinite.intf;

interface ITraining {
	void name();
	void email();
}

class Deepthi implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Deepthi...");
	}

	@Override
	public void email() {
		System.out.println("Email is deepthi@gmail.com");
	}
	
}

class Yashik implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Yashik...");
	}

	@Override
	public void email() {
		System.out.println("Email is yashik@gmail.com");
	}
	
}
public class IntfEx {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] 
		{
			new Deepthi(),
			new Yashik()
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
