package com.java.hib.cms;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class CustomerDAO {
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Query q;
	
	public int loginCheck(Customer lib) {
		q = s.createQuery(
				"from Customer where CUS_USERNAME='" + 
						lib.getCUS_USERNAME() + "' and CUS_PASSWORD='" + lib.getCUS_PASSWORD() + "'");
		List<Customer> lst = q.list();
		if (lst.isEmpty())
			return 0;
		else
			return 1;
	}

}
