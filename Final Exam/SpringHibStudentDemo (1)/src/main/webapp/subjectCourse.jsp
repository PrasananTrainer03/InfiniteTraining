<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="subjectCourse.jsp" name="Form">
<select name="colour" id="dropdown" onchange="change()"></select>
<center>
Select Subject:
<select name="type">
    <option value="PC Architecture">PC Architecture</option>
    <option value="PC Hardware1">PC Hardware1</option>
    <option value="PC Hardware2">PC Hardware2</option>
     <option value="Microprocessor">Microprocessor</option>
      <option value="Data Structure">Data Structure</option>
       <option value="Operating System">Operating System</option>
        <option value="SQl Server">SQl Server</option>
         <option value="Networking">Networking</option>
       
</select>
Theory:
<input type="number" name="theory" id="theory" ><br/><br/>
Practical:
<input type="number" name="practical" id="practical" ><br/><br/>
<input type="submit" name="submit">

</center>
</form>

<%
String colour=request.getParameter("colour");
out.println(colour);
%>
<script>
function change(){
	var s=document.getElementById("dropdown").value;

	if(s == "PC Architecture"){
		productForm.theory.value="42";
		productForm.practical.value="14"
		}
	document.getElementById()
}









</script>


















</body>
</html>