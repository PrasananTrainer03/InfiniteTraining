<%@page import="com.java.hib.MainProg"%>
<%@page import="com.java.hib.TransReturn"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"/><br/><br/>
 
	<table border='3'>
		<tr>
		 <th>Id </th>
		 <th>Issued Date</th>
		 <th>Returned Date</th>
	    </tr>
	<%
	String user=(String)session.getAttribute("user");
	out.write("List of books "+user+" referred: <br/><br/>");
	
	List<TransReturn> lst=new MainProg().bookHistory(user);
	
	if(lst.isEmpty()){
	
	%>
	<tr>
		<td colspan="3">No Books Returned yet...</td>
	</tr>
	<%} else{
		for(TransReturn tr:lst){
			
		int bid=tr.getBookid();
		String fromdate=tr.getFromdate();
		String todate=tr.getToDate();
	%>
	<tr>
		 <th><%=bid%></th>
		 <th><%=fromdate%></th>
		 <th><%=todate%></th>
	    </tr>
	<%} }%>
</body>
</html>