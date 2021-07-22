<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
String user=request.getParameter("username");
String pwd=request.getParameter("pass");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/library",
					"root","root");
String cmd="select * from libusers where "+
		 "UserName=?  and Password = ?";
PreparedStatement pst=con.prepareStatement(cmd);
pst.setString(1,user);
pst.setString(2,pwd);
ResultSet rs=pst.executeQuery();
if(rs.next()){
	session.setAttribute("user",user);
%>
	<jsp:forward page="menu.jsp"/>
<%	
}
else {
	out.println("Invalid Credentials...");
%>
	<jsp:include page="login.html"/>
<%	
}
	%>
</body>
</html>