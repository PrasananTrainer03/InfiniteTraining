<%@page import="com.java.hib.LibraryDAO"%>
<%@page import="com.java.hib.TranBook"%>
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
		 <th>UserName</th>
		 <th>BookID</th>
	    </tr>
	<%
	String user=(String)session.getAttribute("user");
	out.write("List of books "+user+" has: <br/><br/>");
	
	List<TranBook> lst=new LibraryDAO().accountDetails(user);
	
	if(lst.isEmpty()){
	
	%>
	<tr>
	<td colspan="2">No Books Issued yet</td>
	</tr>
	<%} else{
		for(TranBook tb:lst){
			
		int bid=tb.getBookId();
		String fromdate=tb.getFromDate();
		String usr = tb.getUserName();
		int tid = tb.getTid();
	%>
	<tr>
		 <th><%=bid%></th>
		 <th><%=fromdate%></th>
		 <th><%=usr %> </th>
		 <th><%=tid %> </th>
	    </tr>
	<%}} %>
</body>
</html>