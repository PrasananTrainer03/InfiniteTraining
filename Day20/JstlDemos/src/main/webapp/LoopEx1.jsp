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
<c:set value="0" var="i" />
<c:forEach step="1" begin="1" end="10">
	<c:out value="Welcome to JSTL Programming..." />
	<c:set var="i" value="${i+1}" />
	<c:out value="${i}" />
	<br/>
</c:forEach>
</body>
</html>