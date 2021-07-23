<%@page import="com.java.infinite.beans.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanEmploySearch" class="com.java.infinite.beans.EmploySearchBean" />
	<jsp:setProperty property="*" name="beanEmploySearch"/>
	<%
		int eno = beanEmploySearch.getEmpno();
		Emp emp = beanEmploySearch.searchEmploy(eno);
		if (emp!=null) {
	%>
		Employ Name : <%=emp.getName() %> <br/>
		Department : <%=emp.getDept() %> <br /> 
		Designation : <%=emp.getDesig() %>
	<%
		}
	%>
</body>
</html>