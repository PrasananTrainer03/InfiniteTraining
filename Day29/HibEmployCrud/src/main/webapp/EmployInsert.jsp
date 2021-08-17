<%@page import="com.java.hib.SessionHelper"%>
<%@page import="com.java.hib.Gender"%>
<%@page import="com.java.hib.Employ"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("name"));
		employ.setGender(Gender.valueOf(request.getParameter("gender")));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Integer.parseInt(request.getParameter("basic")));
		
		SessionFactory sf = SessionHelper.getFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employ);
		t.commit();
		out.println("*** Record Inserted ***");
	%>
</body>
</html>