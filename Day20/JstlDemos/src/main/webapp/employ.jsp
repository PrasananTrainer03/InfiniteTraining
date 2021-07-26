<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="empno" value="${param.empno}" />
	<c:set var="name" value="${param.name}" />
	<c:set var="dept" value="${param.dept}" />
	<c:set var="desig" value="${param.desig}" />
	<c:set var="basic" value="${param.basic}" />
	
	Employ No : 
	<c:out value="${empno}" /> <br/><br/>
	Employ Name : 
	<c:out value="${name}"/> <br/><br/>
	Department : 
	<c:out value="${dept}" /> <br/><br/>
	Designation : 
	<c:out value="${desig}"/> <br/><br/>
	Basic : 
	<c:out value="${basic}"/>
</body>
</html>