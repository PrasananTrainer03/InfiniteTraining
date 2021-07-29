<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int a,b;
		a=Integer.parseInt(request.getParameter("firstNo"));
		b=Integer.parseInt(request.getParameter("secondNo"));
		 URL url = new URL("http://localhost:8282/RestHelloWorld/webapi/calc/Sum/" +a+"/"+b);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "text/plain");

	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }

	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        String output;
	        out.println("Sum  ");
	        while ((output = br.readLine()) != null) {
	            out.println(output);
	        }
	        
	        URL url1 = new URL("http://localhost:8282/RestHelloWorld/webapi/calc/Sub/" +a+"/"+b);
	        HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
	        conn1.setRequestMethod("GET");
	        conn1.setRequestProperty("Accept", "text/plain");

	        if (conn1.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }

	        BufferedReader br1 = new BufferedReader(new InputStreamReader(
	            (conn1.getInputStream())));

	        String output1;
	        out.println("<br/><br/>Sub  ");
	        while ((output = br1.readLine()) != null) {
	            out.println(output);
	        }
	        
	        URL url2 = new URL("http://localhost:8282/RestHelloWorld/webapi/calc/Mult/" +a+"/"+b);
	        HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
	        conn2.setRequestMethod("GET");
	        conn2.setRequestProperty("Accept", "text/plain");

	        if (conn2.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn2.getResponseCode());
	        }

	        BufferedReader br2 = new BufferedReader(new InputStreamReader(
	            (conn2.getInputStream())));

	        String output2;
	        out.println("<br/><br/>Sub  ");
	        while ((output = br2.readLine()) != null) {
	            out.println(output);
	        }
	        
	%>
</body>
</html>