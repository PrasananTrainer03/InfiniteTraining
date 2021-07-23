<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.java.infinite.beans.Calc"/>
	<jsp:setProperty property="firstNo" name="b1"/>
	<jsp:setProperty property="secondNo" name="b1"/>
	sum is : <%=b1.sum() %>
</body>
</html>