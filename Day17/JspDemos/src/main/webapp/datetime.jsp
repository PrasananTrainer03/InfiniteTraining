<%@page import="java.util.Date"%>
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
		Date dt = new Date();
	%>
	Time is : 
	<%=dt.getHours() %> : <%=dt.getMinutes() %> : <%=dt.getSeconds() %>
</body>
</html>