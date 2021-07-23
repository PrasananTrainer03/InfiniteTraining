<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.java.infinite.beans.Employ" />
	<jsp:setProperty property="*" name="b1"/>
	<p>
		Employ No : 
		<jsp:getProperty property="empno" name="b1"/>
	</p>
	<p>
		Employ Name : 
		<jsp:getProperty property="empName" name="b1"/>
	</p>
	<p>
		Department : 
		<jsp:getProperty property="dept" name="b1"/>
	</p>
	<p>
		Designation :
		<jsp:getProperty property="desig" name="b1"/>
	</p>
	<p>
		Basic : 
		<jsp:getProperty property="basic" name="b1"/>
	</p>
</body>
</html>