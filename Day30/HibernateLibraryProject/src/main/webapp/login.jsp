
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.java.hib.MainProg" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <jsp:useBean id="bean1" class="com.java.hib.LibUsers"/>
	<jsp:setProperty property="*" name="bean1" />
	
	<%
		MainProg obj=new MainProg();
		/* out.println(obj.loginCheck(bean1)); */
		/* out.println("u:"+bean1.getUsername());
		out.println("p:"+bean1.getPassword());
		 */
		int i=obj.loginCheck(bean1);  
		if(i==0)  {
		out.print("Invalid Credentials...."); 
	%>
		<jsp:include page="login.html"></jsp:include>
	<%
		}
		else{
			session.setAttribute("user",bean1.getUsername());
			/* out.print("Login Successful"); */
	%>
		<jsp:include page="menu.jsp"></jsp:include>
	<%
		}
	%>
</body>
</html>