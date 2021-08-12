<%@page import="com.java.hib.cms.SessionHelper"%>
<%@page import="com.java.hib.cms.Vendor"%>
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
<jsp:include page="VendorMenu.jsp"/>
<form method="get" action="VendorAdd.jsp">
	<center>
		Vendor Id : 
			<input type="number" name="VEN_ID" /> <br/><br/>
			 Name : 
			<input type="text" name="VEN_NAME" /> <br/><br/> 
			Phone Number : 
			<input type="text" name="VEN_PHN_NO" /> <br/><br/>
			UserName : 
			 <input type="text" name="VEN_USERNAME" /> <br/><br/>
			Password : 
			<input type="text" name="VEN_PASSWORD" /> <br/><br/> 
			Mail : 
			<input type="text" name="VEN_EMAIL" /> <br/><br/> 
		<input type="submit" value="Insert" />
	</center>
</form>
	
	<%
		if (request.getParameter("VEN_ID") != null) {
		Vendor vendor = new Vendor();
		vendor.setVEN_ID(Integer.parseInt(request.getParameter("VEN_ID")));
		vendor.setVEN_NAME(request.getParameter("VEN_NAME"));
		vendor.setVEN_PHN_NO(request.getParameter("VEN_PHN_NO"));
		vendor.setVEN_USERNAME(request.getParameter("VEN_USERNAME"));
		vendor.setVEN_PASSWORD(request.getParameter("VEN_PASSWORD"));
		vendor.setVEN_EMAIL(request.getParameter("VEN_EMAIL"));

		
		SessionFactory sf = SessionHelper.getFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(vendor);
		t.commit();
		out.println("*** Record Inserted ***");
		}
	%>
	</center>
</body>
</html>