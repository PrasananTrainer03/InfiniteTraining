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
	EmployDAO dao = new EmployDAO();
	int eno = dao.generateEmployNo();
%>
<form method="get" action="AddEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" readonly="readonly" value=<%=eno%> /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/> 
			Gender :
			<select name="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>
			</select> <br/><br/> 
			Department : 
			<input type="text" name="dept" /> <br/><br/>
			Designation : 
			<input type="text" name="desig" /> <br/><br/> 
			Basic : 
			<input type="number" name="basic" /> <br/><br/> 
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<%
		if (request.getParameter("empno") !=null && request.getParameter("basic") !=null) {
			Employ employ = new Employ();
			employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employ.setName(request.getParameter("name"));
			employ.setGender(request.getParameter("gender"));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Integer.parseInt(request.getParameter("basic")));
			dao.addEmploy(employ);
	%>
		<jsp:forward page="EmployTable.jsp" />
	<%
		}
	%>

</body>
</html>