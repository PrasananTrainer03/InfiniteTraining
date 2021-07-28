<%@page import="infinite.EmployServiceDemo.EmployService"%>
<%@page import="infinite.EmployServiceDemo.EmployServiceServiceLocator"%>
<%@page import="infinite.EmployServiceDemo.Employ"%>
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
		int empno,basic;
		String name,gender,dept,desig;
		empno = Integer.parseInt(request.getParameter("empno"));
		name = request.getParameter("name");
		gender = request.getParameter("gender");
		dept = request.getParameter("dept");
		desig = request.getParameter("desig");
		basic = Integer.parseInt(request.getParameter("basic"));
		Employ employ = new Employ();
		employ.setEmpno(empno);
		employ.setName(name);
		employ.setGender(gender);
		employ.setDept(dept);
		employ.setDesig(desig);
		employ.setBasic(basic);
		EmployServiceServiceLocator loc = new EmployServiceServiceLocator();
		EmployService proxy = loc.getEmployService();
		out.println(proxy.addEmploy(employ));
	%>
</body>
</html>