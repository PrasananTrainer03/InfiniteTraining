package com.java.infinite.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class John extends Training {

	@Override
	void name() {
		System.out.println("Name is John...");
	}

	@Override
	void email() {
		System.out.println("Email is john@gmail.com");
	}
	
}
class SaiKumar extends Training {

	@Override
	void name() {
		System.out.println("Name is SaiKumar...");
	}

	@Override
	void email() {
		System.out.println("Email is saikumar@gmail.com");
	}
	
}

class Ashish extends Training {

	@Override
	void name() {
		System.out.println("Name is Ashish...");
	}

	@Override
	void email() {
		System.out.println("Email ashish@gmail.com");
	}
	
}


public class AbsDemo {

	public static void main(String[] args) {
		Training[] arr = new Training[] 
		{
			 new Ashish(),
			 new SaiKumar(),
			 new John()
		};
		
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
}
