<%@page import="infinite.EmployServiceDemo.Employ"%>
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
		Employ result = proxy.searchEmploy(empno);
		out.println("Employ Name " +result.getName() + "<br/>");
		out.println("Gender  " +result.getGender() + "<br/>");
		out.println("Department  " +result.getDept() + "<br/>");
		out.println("Designation  " +result.getDesig() + "<br/>");
		out.println("Basic   " +result.getBasic() + "<br/>");
	%>
</body>
</html>