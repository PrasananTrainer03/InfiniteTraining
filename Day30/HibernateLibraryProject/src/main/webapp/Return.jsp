<%@page import="java.util.List"%>
<%@page import="com.java.hib.MainProg"%>
<%@page import="com.java.hib.TransBook"%>
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
 <form action="ReturnResult.jsp" method="post">
	<table border='3'>
		<tr>
		 <th>Id </th>
		 <th>Issued Date</th>
		 <th> Select </th>
	    </tr>
	<%
	
	String user=(String)session.getAttribute("user");
	
	MainProg obj = new MainProg();
	List<TransBook> lst=obj.showBooks(user);
	
	if(lst==null){
	%>
		<tr>
			<td> No records Found </td>
		</tr>
	<%
	}else{
  		for(TransBook t:lst){
  			int bid=t.getBookId();
  			String bdate=t.getFromDate();
  		
	%>
    <tr>
      <td><%=bid%></td>
   	  <td><%=bdate%></td>
	  <td><input type="checkbox" name="bookid" value="<%=bid%>"/></td>
	</tr>
	
   <% }} %>
   
   <tr> <th colspan=3><input type="submit" value="Return Books" /></th>
   </table>
   </form>	
</body>
</html>