<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.java.infinite.beans.Hello" />
	Default Property Value : 
	<b>
		<jsp:getProperty property="greeting" name="b1"/>
	</b>
	<br/><br/>
	<jsp:setProperty property="greeting" value="Good Evening..." name="b1"/>
	Updated Property Value : 
	<b>
		<jsp:getProperty property="greeting" name="b1"/>
	</b>
</body>
</html>