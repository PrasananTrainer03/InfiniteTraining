<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Empno</th><th>Name</th><th>Salary</th>
	<th>Designation</th>
	<th>Department</th>
	<th>Gender</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.empno}</td>
    <td>${emp.name}</td>
    <td>${emp.basic}</td>
    <td>${emp.desig}</td>
    <td>${emp.basic}</td>
    <td>${emp.dept}</td>
    </tr>
    </c:forEach>
    </table>
    <br/>
<a href="employform">Add Employ Page</a>
</body>
</html>