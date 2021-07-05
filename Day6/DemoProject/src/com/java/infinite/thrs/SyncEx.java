package com.java.infinite.thrs;

class Data {
	synchronized void sayHello(String name) {
		System.out.print("Hello   " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are You...");
	}
}

class Kiran implements Runnable {

	Data data;
	
	Kiran(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.sayHello("Kiran");
	}
	
}
class Nandhini implements Runnable {

	Data data;
	Nandhini (Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.sayHello("Nandhini");
	}
	
}
class Krishna implements Runnable {

	Data data;
	Krishna(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.sayHello("Krishna");
	}
	
}
public class SyncEx {

	public static void main(String[] args) {
		Data data = new Data();
		Krishna obj1 = new Krishna(data);
		Nandhini obj2 = new Nandhini(data);
		Kiran obj3 = new Kiran(data);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
