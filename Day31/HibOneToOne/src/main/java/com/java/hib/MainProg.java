package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainProg {
	public static void main(String[] args) {    
	      
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();   
	      
	    Employee e1=new Employee();    
	    e1.setName("Prasanna Pappu");    
	    e1.setEmail("prassucp@gmail.com");    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("Sree Colony, Road No 3");    
	    address1.setCity("Secunderabad");    
	    address1.setState("TS");    
	    address1.setCountry("India");    
	    address1.setPincode(500046);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);    
	        
	    session.persist(e1);    
	    t.commit();    
	        
	    session.close();    
	    System.out.println("success");    
	}    
}
