<%@page import="com.java.hib.cms.Customer"%>
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
<jsp:include page="CustomerMenu.jsp"/>
<%
	SessionFactory sf = SessionHelper.getFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Customer");
	List<Customer> list=q.list();
%>
	<table border="3">
		<tr>
			<th>Customer Id</th>
			<th>Name</th>
			<th>Phone Number</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
		</tr>
<%
	for(Customer e : list) {
%>
	<tr>
		<td><%=e.getCUS_ID() %> </td>
		<td><%=e.getCUS_NAME() %>  </td>
		<td><%=e.getCUS_PHN_NO() %>  </td>
		<td><%=e.getCUS_USERNAME() %> </td>
		<td><%=e.getCUS_PASSWORD() %> </td>
		<td><%=e.getCUS_EMAIL() %> </td>
		
	</tr>
<%
	}
%>
	</table>

</center>
</body>
</html>