<%@page import="com.java.hib.cms.Wallet"%>
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
	Query q=s.createQuery("from Wallet where Cus_id=1 and WAL_SOURCE='PAYTM'");
	List<Wallet> list=q.list();
%>
<table border="3">
		<tr>
			<th>Customer Id</th>
			<th>Wallet Id</th>
			<th>Wallet Amount</th>
			<th>Wallet Source</th>
		</tr>
<%
	for(Wallet e : list) {
%>
	<tr>
		<td><%=e.getCUS_ID() %> </td>
		<td><%=e.getWAL_ID() %>  </td>
		<td><%=e.getWAL_AMOUNT() %>  </td>
		<td><%=e.getWAL_SOURCE() %> </td>
	</tr>
<%
	}
%>
	</table>


	
	</center>
</body>
</html>