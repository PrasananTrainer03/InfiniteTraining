package com.java.infinite.thrs;

class Tab3 implements Runnable {

	Demo demo;
	
	Tab3(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.showTable(21);
	}
	
}
class Tab2 implements Runnable {

	Demo demo;
	
	Tab2(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.showTable(19);
	}
	
}
class Tab1 implements Runnable {
	Demo demo;
	Tab1(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.showTable(12);
	}
}
class Demo {
	synchronized void showTable(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n + " * " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MTable {

	public static void main(String[] args) {
		Demo demo = new Demo();
		Tab1 obj1 = new Tab1(demo);
		Tab2 obj2 = new Tab2(demo);
		Tab3 obj3 = new Tab3(demo);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
