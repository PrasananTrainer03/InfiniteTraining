<%@page import="infinite.RestClientExample.Employ"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
	<th>Employ No</th>
	<th>Employ Name</th>
	<th>Department</th>
	<th>Designation</th>
	<th>Salary</th>
</tr>

<%
		 URL url = new URL("http://localhost:8282/RestHelloWorld/webapi/employ/empshow");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }

	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        String output;
	        String res="";
	        while ((output = br.readLine()) != null) {
	        	res+=output;
	          //  out.println(output);
	            
	        }
	        ObjectMapper objectMapper = new ObjectMapper();
	        Employ[] employ = objectMapper.readValue(res, Employ[].class);
	      //  out.println(employ.length);

	        for(Employ e : employ) {
  %>
  	<tr>
  		<td> <%=e.getEmpno() %> </td>
  		<td> <%=e.getName() %> </td>
  		<td> <%=e.getDept() %> </td>
  		<td> <%=e.getDesig() %> </td>
  		<td><%=e.getBasic() %> </td>
  	</tr>
  <%
	       	
	        }
	     // out.println(res);
	  %>
	  </table>
</body>
</html>