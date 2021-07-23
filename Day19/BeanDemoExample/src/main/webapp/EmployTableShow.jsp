<%@page import="com.java.infinite.beans.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employBean" class="com.java.infinite.beans.EmployBean" />
	<%
		Emp[] arrEmp = employBean.showEmploy();
	%>
	<table border="3">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Employ Gender</th>
			<th>Employ Department</th>
			<th>Employ Designation</th>
			<th>Employ Basic</th>
		</tr>
		<%
			for(Emp e : arrEmp) {
		%>	
		<tr>
			<td><%=e.getEmpno() %> </td>
			<td><%=e.getName() %>  </td>
			<td><%=e.getGender() %> </td>
			<td><%=e.getDept() %> </td>
			<td><%=e.getDesig() %> </td>
			<td><%=e.getBasic() %> </td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>