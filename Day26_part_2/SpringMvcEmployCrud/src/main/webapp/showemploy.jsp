<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Coming
<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Employ No</th><th>Employ Name</th>
	<th>Gender</th><th>Department</th><th>Designation</th><th>Salary</th></tr>
    <c:forEach var="emp" items="${empList}"> 
    <tr>
    <td>${emp.empno}</td>
    <td>${emp.name}</td>
    <td>${emp.gender}</td>
    <td>${emp.dept}</td>
    <td>${emp.desig}</td>
    <td>${emp.basic}</td>
    
    </tr>
    </c:forEach>
    </table>
    <br/>
</body>
</html>