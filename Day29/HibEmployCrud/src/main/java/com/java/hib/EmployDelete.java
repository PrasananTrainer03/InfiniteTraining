package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDelete {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		int empno;
		System.out.println("Enter Employ No  ");
		Scanner sc = new Scanner(System.in);
		empno=sc.nextInt();
		Query q = s.createQuery("from Employ where empno="+empno);
		List<Employ> employList = q.list();
		if (employList.size() == 1) {
			Employ employ = employList.get(0);
			Transaction t = s.beginTransaction();
		    s.delete(employ);
		    t.commit();
		    System.out.println("Record Deleted...");
		}
	}
}
