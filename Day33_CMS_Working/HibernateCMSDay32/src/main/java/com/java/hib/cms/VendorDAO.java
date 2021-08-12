package com.java.hib.cms;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class VendorDAO {
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Query q;
	
	public int loginCheck(Vendor lib) {
		q = s.createQuery(
				"from Vendor where VEN_USERNAME='" + 
						lib.getVEN_USERNAME() + "' and VEN_PASSWORD='" + lib.getVEN_PASSWORD() + "'");
		List<Vendor> lst = q.list();
		if (lst.isEmpty())
			return 0;
		else
			return 1;
	}

}
