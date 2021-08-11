<%@page import="com.java.hib.cms.SessionHelper"%>
<%@page import="com.java.hib.cms.Customer"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image: url('agent0.jpg');
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>
<center>
<jsp:include page="CustomerMenu.jsp"/>
<form method="get" action="CustomerAdd.jsp">
	<center>
		Customer Id : 
			<input type="number" name="CUS_ID" /> <br/><br/>
			 Name : 
			<input type="text" name="CUS_NAME" /> <br/><br/> 
			Phone Number : 
			<input type="text" name="CUS_PHN_NO" /> <br/><br/>
			UserName : 
			 <input type="text" name="CUS_USERNAME" /> <br/><br/>
			Password : 
			<input type="text" name="CUS_PASSWORD" /> <br/><br/> 
			Mail : 
			<input type="text" name="CUS_EMAIL" /> <br/><br/> 
		<input type="submit" value="Insert" />
	</center>
</form>

	<%
		if (request.getParameter("CUS_ID") != null) {
		Customer customer = new Customer();
		customer.setCUS_ID(Integer.parseInt(request.getParameter("CUS_ID")));
		customer.setCUS_NAME(request.getParameter("CUS_NAME"));
		customer.setCUS_PHN_NO(request.getParameter("CUS_PHN_NO"));
		customer.setCUS_USERNAME(request.getParameter("CUS_USERNAME"));
		customer.setCUS_PASSWORD(request.getParameter("CUS_PASSWORD"));
		customer.setCUS_EMAIL(request.getParameter("CUS_EMAIL"));

		
		SessionFactory sf = SessionHelper.getFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(customer);
		t.commit();
		out.println("*** Record Inserted ***");
		}
	%>
	</center>
</body>
</html>