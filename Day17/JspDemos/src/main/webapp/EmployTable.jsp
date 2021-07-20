<%@page import="com.java.jsp.Employ"%>
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
		Employ[] arrEmploy = dao.showEmploy();
	%>
	<table border="3">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<tr>
	<%
		for(Employ e : arrEmploy) {
	%>
		<td> <%=e.getEmpno() %> </td>
		<td> <%=e.getName() %> </td>
		<td> <%=e.getGender() %> </td>
		<td> <%=e.getDept() %> </td>
		<td> <%=e.getDesig() %> </td>
		<td> <%=e.getBasic() %> </td>
		</tr>
	<%
		}
	%>
		
	</table>
</body>
</html>