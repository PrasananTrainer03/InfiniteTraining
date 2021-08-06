package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> employList = q.list();
		for (Employ employ : employList) {
			System.out.println(employ.getEmpno());
		}
	}
}
