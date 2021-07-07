package org.me.junit.examples;

public class Data {

	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		} else {
			return false;
		}
	}
	public int max3(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m=c;
		}
		return m;
	}
	public int sum(int a,int b) {
		return a+b;
	}
	
	public String sayHello() {
		return "Welcome to Junit...";
	}
}
