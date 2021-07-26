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
	<c:set var="n" value="3" />
	<c:choose>
		<c:when test="${n==1}">
			<c:out value="Hi I am Murari" />
		</c:when>
		<c:when test="${n==2}">
			<c:out value="Hi I am Naresh..." />
		</c:when>
		<c:when test="${n==3}">
			<c:out value="Hi I am Sai Kumar M"/>
		</c:when>
		<c:otherwise>
			<c:out value="Invalid Data..." />
		</c:otherwise>
	</c:choose>
</body>
</html>