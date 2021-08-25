<%@page import="org.me.College.CollegeCRUD"%>
<%@page import="org.me.College.subjects"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="org.me.College.AddSubject" />
<jsp:setProperty property="*" name="bean1"/>
<%
	out.println("Values are Assigned...");
	subjects sub=new subjects();
	sub.setYear(bean1.getYear());
	sub.setInstructor(bean1.getInstructor());
	sub.setSubject(bean1.getSubject());
	sub.setTheory(bean1.getTheory());
	sub.setPractical(bean1.getPractical());
	
	out.println(new CollegeCRUD().addSubject(sub));
%>
</body>
</html>