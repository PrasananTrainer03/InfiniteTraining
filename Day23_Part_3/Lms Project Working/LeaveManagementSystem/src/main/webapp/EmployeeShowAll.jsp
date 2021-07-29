<%@page import="com.java.lms.EmployeeDAO"%>
<%@page import="com.java.lms.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3">
		<tr>
			<th>Employ ID</th>
			<th>Employ Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Date of Join</th>
			<th>Department</th>
			<th>ManagerId</th>
			<th>Available Balance</th>
		</tr>

	<%
		Employee[] employArray = new EmployeeDAO().showEmploy();
		for(Employee e : employArray) {
	%>
		<tr>
			<td> <%=e.getEmpId() %> </td>
			<td> <%=e.getEmpName() %> </td>
			<td> <%=e.getEmpEmail() %>  </td>
			<td> <%=e.getEmpMobile() %> </td>
			<td> <%=e.getEmpDoj() %> </td>
			<td> <%=e.getEmpDept() %> </td>
			<td> <%=e.getMgrId() %> </td>
			<td> <%=e.getLeaveAvail() %> </td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>