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
	<c:set var="empno" value="${param.empno}" />
	<sql:setDataSource var="conn"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/practice"
		user="root"
		password="root"
	/>
<sql:query var="employQuery" dataSource="${conn}">
	select * from Employ WHERE Empno=?
		<sql:param value="${empno}" />
</sql:query>
	<c:set var="flag" value="0" />
	<c:forEach var="e" items="${employQuery.rows}">
		Employ No : 
		<c:out value="${e.empno}" /> <br/>
		Name : 
		<c:out value="${e.name}" /> <br/> 
		Department : 
		<c:out value="${e.dept}" /> <br/> 
		Designation : 
		<c:out value="${e.desig}" /> <br/>
		Basic : 
		<c:out value="${e.basic}" /> <br/>
		<c:set var="flag" value="1" />
	</c:forEach>
	<c:if test="${flag==0}">
		<c:out value="Employ No Not Found..." />
	</c:if>

</body>
</html>