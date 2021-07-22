<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<%
	String user=(String)session.getAttribute("user");
	String sql = null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/library",
						"root","root");
	sql = " SELECT * FROM TranBook WHERE Username = ? " ;			
	PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ps.setString(1,user);						
	ResultSet rs = ps.executeQuery();
	int i = 0;
										
	if(rs.next())
	{
		out.write("<br/><br/>Select which book you want to return :");
		rs.previous();				
		out.write("<html><head><meta http-equiv='Content-Type'" +
		" content='text/html; charset=ISO-8859-1'></head>"+
		"<body><form action='ReturnNext.jsp'><table border='3'><tr>"+
		"<td>BookId</td><td>Fromdate</td><td>Select</td></tr>");			

	while(rs.next()) 
	{					
		int bookid = rs.getInt("BookId");	
		Date fromdate = rs.getDate("Fromdate");
						
		out.write("<td>"+bookid+"</td><td>"+fromdate+"</td>" +
		"<td><input type='checkbox' name='bookid' value="+bookid+"></td></tr>");		
		i++;
	}	

	out.write("</table><br/><input type='submit' value='Return Books' ></form></body></html>");			
	}	
					
	if(i == 0)
	{
		out.write("<br/><br/>No more book is available to return .");
	}	

%>
</body>
</html>