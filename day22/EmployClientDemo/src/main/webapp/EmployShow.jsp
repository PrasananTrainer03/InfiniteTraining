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
	<table border="3">
		<tr> 
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
	
	<%
		EmployServiceServiceLocator loc = new EmployServiceServiceLocator();
		EmployService proxy = loc.getEmployService();
		Employ[] result = proxy.showEmploy();
		for(Employ e : result) {
	%>
		<tr>
			<td><%=e.getEmpno() %>  </td>
			<td><%=e.getName() %>  </td>
			<td><%=e.getDept() %>  </td>
			<td><%=e.getDesig() %> </td>
			<td><%=e.getBasic() %> </td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>