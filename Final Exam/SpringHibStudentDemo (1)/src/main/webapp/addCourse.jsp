<%@page import="org.me.College.CollegeCRUD"%>
<%@page import="org.me.College.CourseList"%>
<%@page import="java.sql.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="org.me.College.AddCourse" />
<jsp:setProperty property="*" name="bean1"/>

<%
	CollegeCRUD obj=new CollegeCRUD();
CourseList objCourseList=new CourseList();
	java.sql.Date sDate = java.sql.Date.valueOf(bean1.getStartDate()); 
	java.sql.Date eDate = java.sql.Date.valueOf(bean1.getEndDate());
	objCourseList.setDuration(bean1.getDuration());
	objCourseList.setStartDate(sDate);
	objCourseList.setEndDate(eDate);
objCourseList.setHOD(bean1.getHod());
	
out.println(obj.generateCourseNo());
out.println(obj.addCourse(objCourseList));
	
%>
</body>
</html>