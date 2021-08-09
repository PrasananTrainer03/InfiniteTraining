<%@page import="com.java.hib.MainProg"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<body>

	<jsp:include page="menu.jsp" />
	<!-- My Method -->
	<%
		String sbook[] = request.getParameterValues("bookid");
		String user = (String) session.getAttribute("user");
		int bid;
		if (sbook != null) {
			for (int i = 0; i < sbook.length; i++) {
				bid = Integer.parseInt(sbook[i]);
				String res = new MainProg().issuedOrNot(user, bid);

				if (res.equals("yes")) {

					out.println("Book is already issued with id" + bid + "<br/> So it cannot be issued again <br>");
				} else {
					out.println("Book issued successfully for id" + bid + "<br/>");
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date idate = new Date();
					String issuedate = sdf.format(idate);
	%>
	<jsp:useBean id="bean1" class="com.java.hib.TransBook" />
	<jsp:setProperty property="userName" name="bean1" value="<%=user%>" />
	<jsp:setProperty property="bookId" name="bean1" value="<%=bid%>" />
	<jsp:setProperty property="fromDate" name="bean1" value="<%=issuedate%>" />

	<%
		MainProg obj = new MainProg();
					obj.issueBook(bean1);
				}
			}

		} else {
			out.println("No books selected!!!" + "<br/>");
		}
	%>
</body>
</html>

<!-- 
Sir's Method
 String user=(String)session.getAttribute("user");
 if(request.getParametervalues("bookid") != null )
 {
  String str[]=request.getParameterValues("bookid");
  Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aditi",
			"root","root");
	for(String s:str)
	{
	query="select Username from TransBook where BookId=?";
	pstmt.setString(1,s);
	ResultSet rs=ps.executeQuery();
	String uname=null;
	if(rs.next())
		uname=rs.getString("Username");
	if(user.equals(uname))
	{
		out.write("<br/> You have already issued the book with id"+s);
	}
	else{
	query="insert into transBook values(?,?,?)";
						pstmt=con.prepareStatement(query);
						pstmt.setString(1,user);
						pstmt.setInt(2,bid);
						pstmt.setString(3, new Date().toString());
						pstmt.executeUpdate();
						
						query="update Books set totalBooks=totalBooks-1 where id=?";
						pstmt=con.prepareStatement(query);
						pstmt.setInt(1,bid);
						pstmt.executeUpdate();
	}
 } -->