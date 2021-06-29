package com.java.infinite.day2;

public class BoxTest {

	public void show(Object ob) {
		// System.out.println(ob.getClass().getSimpleName());
		String type = ob.getClass().getSimpleName();
		if (type.equals("Integer")) {
			System.out.println("Integer Casting...");
			int x = (Integer)ob;
			System.out.println("X value   " +x);
		}
		if (type.equals("Double")) {
			System.out.println("Double Casting...");
			double x = (Double)ob;
			System.out.println("Y Value  " +x);
		}
		if (type.equals("String")) {
			System.out.println("String Casting...");
			String x = (String)ob;
			System.out.println("String Value  " +x);
		}
	}
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name="Madhav";
		BoxTest obj = new BoxTest();
		obj.show(x);
		obj.show(name);
		obj.show(y);
	}
}
