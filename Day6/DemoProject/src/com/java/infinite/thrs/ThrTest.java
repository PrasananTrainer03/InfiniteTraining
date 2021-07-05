package com.java.infinite.thrs;

class Fact implements Runnable {
	@Override
	public void run() {
		int f=1;
		for(int i=1;i<=8;i++) {
			f=f*i;
			System.out.println("Factorial Value   " +f);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Odd implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<20;i+=2) {
			System.out.println("Odd   " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Even implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<20;i+=2) {
			System.out.println("Even   " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThrTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Even());
		Thread t2 = new Thread(new Odd());
		Thread t3 = new Thread(new Fact());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
