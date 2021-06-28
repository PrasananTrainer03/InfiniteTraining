package com.java.infinite.day1;

public class PrimeEx {

	public void check(int n) {
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag=false;
			}
		}
		if (flag==true) {
			System.out.println("Prime Number...");
		} else {
			System.out.println("Not Prime Number...");
		}
	}
	public static void main(String[] args) {
		int n=6;
		PrimeEx obj = new PrimeEx();
		obj.check(n);
	}
}
