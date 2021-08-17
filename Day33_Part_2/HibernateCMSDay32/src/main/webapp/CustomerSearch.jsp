<%@page import="com.java.hib.cms.Customer"%>
<%@page import="com.java.hib.cms.SessionHelper"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
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
	<form method="get" action="CustomerSearch.jsp">
		Customer Id : 
		<input type="number" name="CUS_ID" /> <br/><br/>
		<input type="submit" value="Search" /> <br/><Br/>
	</form>
	<%
		if (request.getParameter("CUS_ID") !=null) {
			int CUS_ID = Integer.parseInt(request.getParameter("CUS_ID"));
			SessionFactory sf = SessionHelper.getFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Customer where CUS_ID="+ CUS_ID);
			List<Customer> customerList = q.list();
			if (customerList.size() == 1) {
				Customer customer = customerList.get(0);
				out.println("Customer Id  : " +customer.getCUS_ID()+ "<br/>");
				out.println("Name : " +customer.getCUS_NAME()+ "<br/>");
				out.println("Phone No  : " +customer.getCUS_PHN_NO()+ "<br/>");
				out.println("User Name  : " +customer.getCUS_USERNAME()+ "<br/>");
				out.println("Password  : " +customer.getCUS_PASSWORD()+ "<br/>");
				out.println("Email Id  : " +customer.getCUS_EMAIL()+ "<br/>");



			}
			//out.println(customerList.size());
		}
	%>
	</center>
</body>
</html>