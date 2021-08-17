<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
        <h1>Edit Contact</h1>
        <form:form action="updateemploy" method="post" modelAttribute="employ">
        <table>
             <tr>
                <td>Employ No:</td>
                <td><form:input path="empno" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><form:input path="gender" /></td>
            </tr>
            <tr>
                <td>Department:</td>
                <td><form:input path="dept" /></td>
            </tr>
            <tr>
                <td>Designation:</td>
                <td><form:input path="desig" /></td>
            </tr>
             <tr>
                <td>Basic:</td>
                <td><form:input path="basic" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>