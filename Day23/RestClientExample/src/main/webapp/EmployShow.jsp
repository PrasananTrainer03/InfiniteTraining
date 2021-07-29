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
<%
		int a = Integer.parseInt(request.getParameter("empno"));
		 URL url = new URL("http://localhost:8282/RestHelloWorld/webapi/employ/empsearch/"+a);
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
	            //out.println(output);
	        }
	       // out.println(res);
	      Employ employ = new ObjectMapper().readValue(res, Employ.class);
	    out.println("Employ No  " +employ.getEmpno() + "<br/>");
	    out.println("Employ Name " +employ.getName() + "<br/>");
	    out.println("Department  " +employ.getDept() + "<br/>"); 
	    out.println("Designation  " +employ.getDesig() + "<br/>");
	    out.println("Salary  " +employ.getBasic() + "<br/>");
	  %>
</body>
</html>