<%@page import="com.java.hib.MainProg"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
	function show(fine) {
		alert("You have to pay a fine of Rs. " + fine);
	}
</script>
<body>
	<jsp:include page="menu.jsp" />
	<%
		String rbook[] = request.getParameterValues("bookid");
		String user = (String) session.getAttribute("user");
		int bid;
		if (rbook != null) {
			for (String s : rbook)
			{
				bid = Integer.parseInt(s);
				int days = new MainProg().returnBooks(bid, user);
				
				if(days==-1){
					out.write("Books Couldnot be Returned...");
				}
				else{
					out.write("Book Returned Successfully...");
				}
				if (days ==0) {
					int fine = 5 * (days+1 - 7);
					out.println("<body><script> alert('Pay fine of Rs " + fine + " for the past " + (days - 7)
							+ " days')</script></body>");
				}
				// out.println("Pay a fine of Rs.<font color='red'> "+fine +"</font> for the past "+(days-7)+" days");   

			}
		} else
			out.println("No books selected!!!" + "<br/>");
	%>
</body>
</html>

<!--String to Date
 String startDateStr = request.getParameter("startDate");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//surround below line with try catch block as below code throws checked exception
Date startDate = sdf.parse(startDateStr);-->