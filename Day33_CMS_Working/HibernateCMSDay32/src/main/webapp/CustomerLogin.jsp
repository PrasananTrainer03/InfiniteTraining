
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.java.hib.cms.CustomerDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image: url('agent0.jpg');
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body >

 <jsp:useBean id="bean1" class="com.java.hib.cms.Customer"/>
	<jsp:setProperty property="*" name="bean1" />
	
	<%
		CustomerDAO obj=new CustomerDAO();
		/* out.println(obj.loginCheck(bean1)); */
		/* out.println("u:"+bean1.getUsername());
		out.println("p:"+bean1.getPassword());
		 */
		int i=obj.loginCheck(bean1);  
		if(i==0)  {
		out.print("Invalid Credentials...."); 
	%>
		<jsp:include page="CustomerLogin.html"></jsp:include>
	<%
		}
		else{
			session.setAttribute("user",bean1.getCUS_USERNAME());
			out.print("Login Successful"); 
			
		%>
		<center>
<br><br><br>
<table border="3">
	
<tr>
	<th>Options</th>
</tr>
	<jsp:include page="CustomerMenu.jsp"/>
	</table>
</center>
	<%	
		}
		
	%>
	
</body>
</html>