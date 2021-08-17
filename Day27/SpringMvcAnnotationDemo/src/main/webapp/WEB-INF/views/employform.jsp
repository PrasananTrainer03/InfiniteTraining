<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1>Add New Employee</h1>
       <form:form method="post" action="save">  
      	<table >  
      	<tr>
      		<th>Employ No</th>
      		<td>
      		<form:input path="empno"/>
      		</td>
      	</tr>
      	<tr>
      	<th>Gender</th>
      	<td>
      		<form:select path="gender">  
        <form:option value="MALE" label="Male"/>  
        <form:option value="FEMALE" label="Female"/>  
        </form:select>  
      	</td>
      	</tr>
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>
         	<th>Department</th>
         	<td>
         		<form:input path="dept"  />
         	</td>
         </tr>
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="basic" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="desig" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

</body>
</html>