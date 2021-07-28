<%@page import="infinite.EmployServiceDemo.EmployService"%>
<%@page import="infinite.EmployServiceDemo.EmployServiceServiceLocator"%>
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
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployServiceServiceLocator loc = new EmployServiceServiceLocator();
		EmployService proxy = loc.getEmployService();
		out.println(proxy.deleteEmploy(empno));
	%>
</body>
</html>