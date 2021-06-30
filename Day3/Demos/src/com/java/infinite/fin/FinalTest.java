package com.java.infinite.fin;

class Data {
	final void show() {
		System.out.println("From Show Method...");
	}
}

class Test extends Data {
//	void show() {
//		
//	} will throw error as final method cannot be overrided
}
public class FinalTest {

}
