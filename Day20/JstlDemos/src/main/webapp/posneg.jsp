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
	<c:if test="${eno >= 0}">
		<c:out value="Positive Number..." />
	</c:if>
	<c:if test="${eno < 0}">
		<c:out value="Negative Number..." />
	</c:if>
</body>
</html>