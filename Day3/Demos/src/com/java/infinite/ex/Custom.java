package com.java.infinite.ex;

class NegativeException extends Exception {
	NegativeException(String error) {
		super(error);
	}
}

class NumberZeroException extends Exception {
	NumberZeroException(String error) {
		super(error);
	}
}

public class Custom {

	public void sum(int a,int b) throws NegativeException, NumberZeroException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Numbers not allowed...");
		} else if (a == 0 || b == 0) {
			throw new NumberZeroException("Zero is Invalid Value...");
		} else {
			int c=a+b;
			System.out.println("Sum is  " +c);
		}
	}
	
	public static void main(String[] args) {
		int a=6,b=3;
		Custom obj = new Custom();
		try {
			obj.sum(a, b);
		} catch (NegativeException | NumberZeroException e) {
			System.out.println(e.getMessage());
		}
	}
}
