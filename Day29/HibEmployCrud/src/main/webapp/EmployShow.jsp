<%@page import="com.java.hib.Employ"%>
<%@page import="com.java.hib.SessionHelper"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
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
	SessionFactory sf = SessionHelper.getFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Employ");
	List<Employ> list=q.list();
%>
	<table border="3">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
<%
	for(Employ e : list) {
%>
	<tr>
		<td><%=e.getEmpno() %> </td>
		<td><%=e.getName() %>  </td>
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