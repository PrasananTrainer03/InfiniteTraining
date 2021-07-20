<%@page import="com.java.jsp.EmployDAO"%>
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
		EmployDAO dao = new EmployDAO();
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		int count = dao.authenticate(user, pwd);
		if (count==1) {
	%>
		<jsp:forward page="EmployTable.jsp" />
	<% 
		} else {
	%>
		<jsp:include page="login.html" />
	<%
		}
	%>
</body>
</html>