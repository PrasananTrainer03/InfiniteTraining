<%@page import="com.java.hib.cms.Vendor"%>
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
<jsp:include page="VendorMenu.jsp"/>
	<form method="get" action="VendorSearch.jsp">
		Vendor Id : 
		<input type="number" name="VEN_ID" /> <br/><br/>
		<input type="submit" value="Search" /> <br/><Br/>
	</form>
	<%
		if (request.getParameter("VEN_ID") !=null) {
			int VEN_ID = Integer.parseInt(request.getParameter("VEN_ID"));
			SessionFactory sf = SessionHelper.getFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Vendor where VEN_ID="+ VEN_ID);
			List<Vendor> vendorList = q.list();
			if (vendorList.size() == 1) {
				Vendor vendor = vendorList.get(0);
				out.println("Vendor Id  : " +vendor.getVEN_ID()+ "<br/>");
				out.println("Name : " +vendor.getVEN_NAME()+ "<br/>");
				out.println("Phone No  : " +vendor.getVEN_PHN_NO()+ "<br/>");
				out.println("User Name  : " +vendor.getVEN_USERNAME()+ "<br/>");
				out.println("Password  : " +vendor.getVEN_PASSWORD()+ "<br/>");
				out.println("Email Id  : " +vendor.getVEN_EMAIL()+ "<br/>");



			}
			//out.println(vendorList.size());
		}
	%>
	</center>
</body>
</html>