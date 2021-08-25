package org.me.College;

import java.util.List;

import org.me.College.CourseList;
import org.me.College.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;




public class CollegeCRUD {
	public String generateCourseNo(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
	    List<CourseList> lstCourse=ht.find("from CourseList");
	    
	    String courseno="";
	    if(lstCourse.size()==0){
	    	courseno="C001";
	    	return courseno;
	    }
	    else {
	    	for(CourseList c : lstCourse){
	    		courseno=c.getCourseno();
	    	}
	    	 int cno= Integer.parseInt(courseno.substring(1));
	    	 cno++;
	    	 if(cno>=1&&cno<=9){
	    		 courseno="C00"+cno;
	    	 }
	    	 if(cno>9&&cno<99)
	    	 {
	    		 courseno="C0"+cno;
	    	 }
	    	 if(cno>99&&cno<999)
	    	 {
	    		 courseno="C"+cno;
	    	 }
	    	 System.out.println("Course No is " +courseno);
	    	 return courseno;
	    }
}
	
	public String addCourse(CourseList obj){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		obj.setCourseno(generateCourseNo());
		ht.save(obj);
		
		return "Course added";
	}
	
	public String addSubject(subjects obj){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		ht.save(obj);
		return "Subject added";
		
		
	}
	
	public String addFeedback(FeedBack obj){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		ht.save(obj);
		ht.update(obj);
		return "Feedback  added";
		
		
	}
	
	public String feedbackId(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
	    List<FeedBack> lstFeed=ht.find("from FeedBack");
	    
	    String feedid="";
	    if(lstFeed.size()==0){
	    	feedid="C001";
	    	return feedid;
	    }
	    else {
	    	for(FeedBack c : lstFeed){
	    		feedid=c.getFid();
	    	}
	    	 int fid= Integer.parseInt(feedid.substring(1));
	    	 fid++;
	    	 if(fid>=1&&fid<=9){
	    		 feedid="C00"+fid;
	    	 }
	    	 if(fid>9&&fid<99)
	    	 {
	    		 feedid="C0"+fid;
	    	 }
	    	 if(fid>99&&fid<999)
	    	 {
	    		 feedid="C"+fid;
	    	 }
	    	 System.out.println("FeedBack is " +feedid);
	    	 return feedid;
	    }
}
	public List<String> getSubjects(String instructor){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		List<String> instr=ht.find("select subject from subjects where instructor='" +instructor+"'");
		return instr;
	}
	
	public List<String> getInstructors(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("org/me/College/application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		List<String> instr=ht.find("select distinct instructor from subjects");
		return instr;
	}
	
	
	
}
