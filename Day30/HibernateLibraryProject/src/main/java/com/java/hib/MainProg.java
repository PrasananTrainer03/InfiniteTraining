package com.java.hib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.text.Position.Bias;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {

	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Query q;

	public int loginCheck(LibUsers lib) {

		q = s.createQuery(
				"from LibUsers where username='" + lib.getUsername() + "' and password='" + lib.getPassword() + "'");
		List<LibUsers> lst = q.list();

		if (lst.isEmpty())
			return 0;
		else
			return 1;

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

	public String issuedOrNot(String user, int bid) {

		q = s.createQuery("from TransBook where userName='" + user + "' and bookId=" + bid);
		List<TransBook> lst = q.list();

		if (!lst.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}

	
	public void issueBook(TransBook tb) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
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

	public List<TransBook> showBooks(String user) {
		q = s.createQuery("from TransBook where userName='" + user + "'");

		List<TransBook> lst = q.list();
		if (lst.isEmpty()) {
			return null;
		} else {
			return lst;
		}
	}
	
	public void UpdateBook(TransBook tb) {

		Transaction t = s.beginTransaction();
		
		q = s.createQuery("from Books where id=" + tb.getBookId());
		List<Books> lst = q.list();

		t.begin();
		Books b1 = new Books();
		if (lst.size() > 0) {
			for (Books b2 : lst) {
				b1=b2;
				//b2.setTotalbooks(b2.getTotalbooks() + 1);

			}
			 b1.setTotalbooks(b1.getTotalbooks()+1);
		}

		s.save(b1);
		t.commit();
		
	}


	public int returnBooks(int bookid, String userName) throws ParseException {

		q = s.createQuery("from TransBook where userName='" + userName + "' and bookid=" + bookid);
		List<TransBook> lst = q.list();

		TransBook tb=new TransBook();
		TransReturn tr= new TransReturn();;
		int days;
		if (lst.isEmpty()) {
			return -1;
		} else {

			for (TransBook tb1 : lst) {
				tb = tb1;
			}
		

			String fdate = tb.getFromDate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date idate = sdf.parse(fdate);
			Date rdate = new Date();
			days = (int) ((rdate.getTime() - idate.getTime()) / (1000 * 60 * 60 * 24));

			tr.setBookid(bookid);
			tr.setUserName(userName);
			tr.setFromdate(fdate);
			tr.setToDate(sdf.format(rdate));

			// inserting to TransReturn table
			Transaction t = s.beginTransaction();

			s.save(tr);
			t.commit();

			t=s.beginTransaction();
			// update books
			UpdateBook(tb);

			// delete from transbook
		//	t.begin();
			tb.setBookId(bookid);
			s.delete(tb);
			t.commit();

			return days;
		}

	}
	
	public List<TransBook> accountDetails(String user){
		
		q = s.createQuery("from TransBook where userName='" + user+"'");
		List<TransBook> lst=q.list();
		
		return lst;
	}
	

	public List<TransReturn> bookHistory(String user){
		
		q = s.createQuery("from TransReturn where userName='" + user+"'");
		List<TransReturn> lst=q.list();
		
		return lst;
	}
}
