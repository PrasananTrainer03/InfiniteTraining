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
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/library",
					"root","root");
	if(request.getParameterValues("bookid") != null)
	{
		String str[] = request.getParameterValues("bookid");
		

			for(String s : str)
			{
			String sql = "SELECT * FROM TranBook WHERE Username = ? ";
			PreparedStatement ps = con.prepareStatement(sql,
			ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,user);
			ResultSet rs =ps.executeQuery();
			String uname = null;
			Date fromdate;
			Date todate = new Date(session.getLastAccessedTime());
			
			if(rs.next()) 
			{
				uname = rs.getString("Username");
				fromdate = rs.getDate("Fromdate");
			
				if(user.equals(uname))
				{
					
					String sql1 = "DELETE FROM TranBook WHERE BookId = ? AND Username = ? " ;
					PreparedStatement ps1 = con.prepareStatement(sql1);
					ps1.setString(1,s);
					ps1.setString(2,user);
					ps1.executeUpdate();
											
					String sql2 = " INSERT INTO TransReturn VALUES (?,?,?,?)" ;
					PreparedStatement ps2 = con.prepareStatement(sql2);
					ps2.setString(1,user);
					ps2.setString(2,s);
					ps2.setDate(3,fromdate);
					ps2.setDate(4,todate);
					ps2.executeUpdate();
																	
					String sql3 = "SELECT TotalBooks FROM Books WHERE Id = ?";
					PreparedStatement ps3 = con.prepareStatement(sql3);
					ps3.setString(1,s);
					ResultSet rs3 =ps3.executeQuery();
					rs3.next();
					String btotal = rs3.getString("TotalBooks");
					int bt = Integer.parseInt(btotal);
					bt = bt+1;
					
					String sql4 = "UPDATE Books SET TotalBooks = ? WHERE Id = ?" ;
					PreparedStatement ps4 = con.prepareStatement(sql4);
					ps4.setInt(1,bt);
					ps4.setString(2,s);
					ps4.executeUpdate();
					
					out.write("<br/><br/>The book with Id ("+s+") is returned !...");	
				}
			}
			}				
	}
	else
	{
		out.write("<br/><br/>Please select book to return ....... ");			
	}
%>
</body>
</html>