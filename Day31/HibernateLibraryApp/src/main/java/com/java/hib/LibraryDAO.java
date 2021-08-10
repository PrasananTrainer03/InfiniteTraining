package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class LibraryDAO {

	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Query q;
	
	public String issuedOrNot(String user, int bid) {

		q = s.createQuery("from TranBook where userName='" + user + "' and bookId=" + bid);
		List<TranBook> lst = q.list();

		if (!lst.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}

	public List<TranReturn> bookHistory(String user){
		
		q = s.createQuery("from TranReturn where userName='" + user+"'");
		List<TranReturn> lst=q.list();
		
		return lst;
	}


	public List<TranBook> accountDetails(String user){
		q = s.createQuery("from TranBook where userName='" + user+"'");
		List<TranBook> lst=q.list();
		return lst;
	}
	
	public void issueBook(TranBook tb) {
		SessionFactory sf = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(tb);
		t.commit();

		t=s.beginTransaction();
		q = s.createQuery("from Books where id=" + tb.getBookId());
		List<Books> lst = q.list();
		// Transaction t1 = s.beginTransaction();
//		t.begin();
		Books b1 = new Books();
		if (lst.size() > 0) {
			for (Books b2 : lst) {
				b1 = b2;
				// b2.setTotalbooks(b2.getTotalbooks() - 1);

			}
			b1.setTotalbooks(b1.getTotalbooks() - 1);
		}

		s.save(b1);
		t.commit();
		
	}

	public List<Books> searchBooks(String searchtype, String searchvalue) {

		if (searchtype.equals("id"))
			q = s.createQuery("from Books where id=" + Integer.parseInt(searchvalue));
		else if (searchtype.equalsIgnoreCase("dept"))
			q = s.createQuery("from Books where dept='" + searchvalue + "'");

		else if (searchtype.equalsIgnoreCase("bookname"))
			q = s.createQuery("from Books where name='" + searchvalue + "'");

		else if (searchtype.equalsIgnoreCase("authorname"))
			q = s.createQuery("from Books where author='" + searchvalue + "'");
		else
			q = s.createQuery("from Books where name!='" + searchvalue + "' or 1=1");

		List<Books> lst = q.list();

		if (lst.isEmpty())
			return null;
		else
			return lst;

	}

	public int loginCheck(Libusers lib) {
		q = s.createQuery(
				"from Libusers where username='" + 
						lib.getUsername() + "' and password='" + lib.getPassword() + "'");
		List<Libusers> lst = q.list();
		if (lst.isEmpty())
			return 0;
		else
			return 1;
	}
}
