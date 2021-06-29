package com.java.infinite.quiz;

class C1 {
    public C1() {
     System.out.println("C1 Constructor...");
    }
}

class C2 extends C1 {
   C2() {
     System.out.println("C2 Constructor...");
   }
}
public class Quiz9 {

	public static void main(String[] args) {
		new C2();
	}
}
