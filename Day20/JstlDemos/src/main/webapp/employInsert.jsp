<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/practice"
		user="root"
		password="root"
	/>
	<sql:update var="empUpdate" dataSource="${conn}">
		Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)
		<sql:param value="${param.empno}" />
		<sql:param value="${param.name}" />
		<sql:param value="${param.gender}"/>
		<sql:param value="${param.dept}" />
		<sql:param value="${param.desig}" />
		<sql:param value="${param.basic}" />
	</sql:update>
	<c:out value="Record Inserted..." />
</body>
</html>