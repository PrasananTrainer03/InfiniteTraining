package com.java.infinite.quiz;

public class MenuEx {

	public void menu(int a,int b, int ch) {
		do {
		System.out.println("O P T I O N S");
		System.out.println("---------------");
		System.out.println("1. SUM");
		System.out.println("2. SUB");
		System.out.println("3. MULT");
		System.out.println("4. Exit");
		switch(ch) {
		case 1 : 
			int c=a+b;
			System.out.println("Sum  " +c);
			break;
		case 2 : 
			c=a-b;
			System.out.println("Sub  " +c);
			break;
		case 3 : 
			c=a*b;
			System.out.println("Sub  " +c);
			break;
		}
		ch=4;
		}while(ch!=4);
		
	}
	public static void main(String[] args) {
		int a,b,ch;
		a=5;
		b=7;
		ch=4;
		MenuEx obj = new MenuEx();
		obj.menu(a, b, ch);
	}
}
