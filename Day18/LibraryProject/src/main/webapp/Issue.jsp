<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
	if(request.getParameterValues("bookid") != null)
	{			
		String str[] = request.getParameterValues("bookid");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/library",
							"root","root");
			for(String s : str)
			{
			String sql = "SELECT Username FROM TranBook WHERE BookId = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,s);
			ResultSet rs =ps.executeQuery();
			String uname = null;
			if(rs.next()) uname = rs.getString("Username");
			
			if(user.equals(uname))
			{
				out.write("<br/><br/>You have already issued the book with Id ("+s+")");
			}
			else
			{
String sql1 = "INSERT INTO TranBook VALUES(?,?,?)" ;
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1,user);
			ps1.setString(2,s);
			ps1.setDate(3,new Date(session.getLastAccessedTime()));
			ps1.executeUpdate();
			
			String sql2 = "SELECT TotalBooks FROM Books WHERE Id = ?";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setString(1,s);
			ResultSet rs2 =ps2.executeQuery();
			rs2.next();
			String btotal = rs2.getString("TotalBooks");
			int bt = Integer.parseInt(btotal);
			bt = bt-1;
			
			String sql3 = "UPDATE Books SET TotalBooks = ? WHERE Id = ?" ;
			PreparedStatement ps3 = con.prepareStatement(sql3);
			ps3.setInt(1,bt);
			ps3.setString(2,s);
			ps3.executeUpdate();
			
			out.write("<br/><br/>The book with Id ("+s+") is issued !...");	
			}
			}
		
					
	}
	else
	{
		out.write("<br/><br/>Please select book to issue ....... ");			
	}		
	%>
</body>
</html>