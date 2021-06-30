package com.java.infinite.ex;

public class ThrEx {

	public void show(int n) {
		if (n < 0) {
			throw new NumberFormatException("Negative Numbers not allowed...");
		} else if (n == 0) {
			throw new ArithmeticException("Zero is Invalid Value...");
		} else {
			System.out.println("N value is   " +n);
		}
	}
	public static void main(String[] args) {
		int n=6;
		ThrEx obj = new ThrEx();
		try {
			obj.show(n);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
