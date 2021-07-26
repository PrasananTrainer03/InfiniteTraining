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
	<c:set var="eno" value="${param.eno}" />
	<c:if test="${eno%2==0}">
		<c:out value="Even Number..." />
	</c:if>
	<c:if test="${eno%2==1}">
		<c:out value="Odd Number..." />
	</c:if>
</body>
</html>