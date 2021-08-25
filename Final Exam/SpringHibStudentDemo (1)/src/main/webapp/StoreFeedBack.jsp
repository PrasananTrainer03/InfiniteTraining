<%@page import="org.me.College.CourseList"%>
<%@page import="org.me.College.FeedBack"%>
<%@page import="org.me.College.CollegeCRUD"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="org.me.College.FeedBackConfirm"/>
<jsp:setProperty property="*" name="bean1"/>
	<%
		out.println(bean1.getFid());
		out.println(bean1.getStudentName());
		out.println(bean1.getInstructor());
		out.println(bean1.getSubject());
		out.println(bean1.getFeedback());
		
		FeedBack obj=new FeedBack(); 
		obj.setFbvalue(bean1.getFeedback()); 
		obj.setFid(bean1.getFid());
		obj.setInstructor(bean1.getInstructor());
		obj.setStudentName(bean1.getStudentName());
		obj.setSubject(bean1.getSubject()); 
		
		CollegeCRUD objc=new CollegeCRUD();
		out.println(objc.addFeedback(obj));
	%>
</body>





</html>