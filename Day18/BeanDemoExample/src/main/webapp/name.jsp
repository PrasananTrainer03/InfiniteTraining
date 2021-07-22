<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.java.infinite.beans.Name" />
	<jsp:setProperty property="sname" name="b1"/>
	Name is : 
	<jsp:getProperty property="sname" name="b1"/>
</body>
</html>