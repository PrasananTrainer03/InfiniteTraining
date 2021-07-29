<%@page import="com.java.lms.LeaveDetailsDAO"%>
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
		int leaveId = Integer.parseInt(request.getParameter("leaveId"));
		int managerId = Integer.parseInt(request.getParameter("managerId"));
		String managerComments = request.getParameter("managerComments");
		String status = request.getParameter("status");
		LeaveDetailsDAO dao = new LeaveDetailsDAO();
		out.println(dao.approveDeny(leaveId, managerId, managerComments, status));
	%>
</body>
</html>