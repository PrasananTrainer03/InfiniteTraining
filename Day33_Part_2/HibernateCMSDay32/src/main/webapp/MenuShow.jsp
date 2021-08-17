<%@page import="com.java.hib.cms.Menu"%>
<%@page import="com.java.hib.cms.SessionHelper"%>
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
<style>
body {
  background-image: url('agent0.jpg');
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>
<center>
<%
	SessionFactory sf = SessionHelper.getFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Menu");
	List<Menu> list=q.list();
%>
	<table border="3">
		<tr>
			<th>Menu Id</th>
			<th>Menu Item</th>
			<th>Menu Price</th>
			<th>Menu Calories</th>
			<th>Menu Speciality</th>
		</tr>
<%
	for(Menu e : list) {
%>
	<tr>
		<td><%=e.getMEN_ID() %> </td>
		<td><%=e.getMEN_ITEM() %>  </td>
		<td><%=e.getMEN_PRICE() %>  </td>
		<td><%=e.getMEN_CALORIES() %> </td>
		<td><%=e.getMEN_SPECIALITY() %> </td>
	</tr>
<%
	}
%>
	</table>

</center>
</body>
</html>