<%@page import="com.java.infinite.ws.Calculation"%>
<%@page import="com.java.infinite.ws.CalculationService"%>
<%@page import="com.java.infinite.ws.CalculationServiceLocator"%>
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
		int a,b,c;
		a=Integer.parseInt(request.getParameter("firstNo"));
		b=Integer.parseInt(request.getParameter("secondNo"));
		CalculationServiceLocator locator = new CalculationServiceLocator();
		Calculation proxy = locator.getCalculation();
		c=proxy.sum(a, b);
		out.println("Sum is  " +c+ "<Br/>");
		c=proxy.sub(a, b);
		out.println("Sub is  " +c+ "<Br/>");
		c=proxy.mult(a, b);
		out.println("Mult is   " +c+ "<br/>");
	%>
</body>
</html>