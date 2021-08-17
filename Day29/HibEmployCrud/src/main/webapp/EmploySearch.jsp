<%@page import="com.java.hib.Employ"%>
<%@page import="com.java.hib.SessionHelper"%>
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
</head>
<body>
	<form method="get" action="EmploySearch.jsp">
		Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		<input type="submit" value="Search" /> <br/><Br/>
	</form>
	<%
		if (request.getParameter("empno") !=null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			SessionFactory sf = SessionHelper.getFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Employ where empno="+empno);
			List<Employ> employList = q.list();
			if (employList.size() == 1) {
				Employ employ = employList.get(0);
				out.println("Employ Name  " +employ.getName());
				out.println("Name  " +employ.getName());
				out.println("Department  " +employ.getDept());
			}
			//out.println(employList.size());
		}
	%>
</body>
</html>