<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class="com.java.infinite.beans.EmployInsertBean" />
	<jsp:setProperty property="*" name="bean1"/>
	<%=bean1.addEmploy() %>
</body>
</html>