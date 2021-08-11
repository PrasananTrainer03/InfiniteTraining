<%@page import="com.java.hib.cms.Vendor"%>
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
<jsp:include page="VendorMenu.jsp"/>
<center>
<%
	SessionFactory sf = SessionHelper.getFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Vendor");
	List<Vendor> list=q.list();
%>
	<table border="3">
		<tr>
			<th>Vendor Id</th>
			<th>Name</th>
			<th>Phone Number</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
		</tr>
<%
	for(Vendor e : list) {
%>
	<tr>
		<td><%=e.getVEN_ID() %> </td>
		<td><%=e.getVEN_NAME() %>  </td>
		<td><%=e.getVEN_PHN_NO() %>  </td>
		<td><%=e.getVEN_USERNAME() %> </td>
		<td><%=e.getVEN_PASSWORD() %> </td>
		<td><%=e.getVEN_EMAIL() %> </td>
		
	</tr>
<%
	}
%>
	</table>

</center>
</body>
</html>