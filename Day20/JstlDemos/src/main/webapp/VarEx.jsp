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
	<c:set var="trainer" value="Prasanna" />
	Trainer is : 
	<c:out value="${trainer}" /> <br/><br/>
	<c:set var="company" value="Infinite" /> 
	Company is : 
	<c:out value="${company}" /> <br/><br/> 
	<c:set var="topic" value="Java Training JSTL Going On" />
	<c:out value="${topic}" />
</body>
</html>