<%@page import="com.java.hib.cms.Menu"%>
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
	<form method="get" action="MenuSearch.jsp">
		Menu Id : 
		<input type="number" name="MEN_ID" /> <br/><br/>
		<input type="submit" value="Search" /> <br/><Br/>
	</form>
	<%
		if (request.getParameter("MEN_ID") !=null) {
			int MEN_ID = Integer.parseInt(request.getParameter("MEN_ID"));
			SessionFactory sf = SessionHelper.getFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Menu where MEN_ID="+ MEN_ID);
			List<Menu> menuList = q.list();
			if (menuList.size() == 1) {
				Menu menu = menuList.get(0);
				out.println("Menu Id  : " +menu.getMEN_ID()+ "<br/>");
				out.println("Menu Item  : " +menu.getMEN_ITEM()+ "<br/>");
				out.println("Menu Price  : " +menu.getMEN_PRICE()+ "<br/>");
				out.println("Menu Calories  : " +menu.getMEN_CALORIES()+ "<br/>");
				out.println("Menu Speciality  : " +menu.getMEN_SPECIALITY()+ "<br/>");



			}
			//out.println(menuList.size());
		}
	%>
</center>
</body>
</html>