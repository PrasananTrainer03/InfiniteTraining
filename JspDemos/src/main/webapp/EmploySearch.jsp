<%@page import="com.java.jsp.Employ"%>
<%@page import="com.java.jsp.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDAO();
	Employ employ = dao.searchEmploy(empno);
	if (employ!=null) {
%>
   Employ Name : <%=employ.getName() %> <br/>
   Gender : <%=employ.getGender() %> <br/> 
   Department : <%=employ.getDept() %> <br/> 
   Designation : <%=employ.getDesig() %> <br/>
   Basic : <%=employ.getBasic() %> <br/><hr/>
<%
	}
%>
<a href="AddEmploy.jsp">Add Employ</a>
</body>
</html>