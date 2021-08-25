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
	/* session.setAttribute("fid",fid);
    session.setAttribute("studentName",request.getParameter("studentName"));
    session.setAttribute("instructor",request.getParameter("instructor"));
    */
    session.setAttribute("subject",request.getParameter("subject"));
    session.setAttribute("feedback",request.getParameter("feedback"));
    String fid=(String)session.getAttribute("fid");
    String studentName=(String)session.getAttribute("studentName");
    String instructor=(String)session.getAttribute("instructor"); 
    String subject=(String)session.getAttribute("subject");
    String feedback=(String)session.getAttribute("feedback");
    
		out.println(session.getAttribute("fid"));
		out.println(session.getAttribute("studentName"));
		out.println(session.getAttribute("instructor"));
		out.println(session.getAttribute("subject"));
		out.println(session.getAttribute("feedback"));
	%>
	<form method="post" action="StoreFeedBack.jsp">
		FeedBack ID : 
		<input type='text' name="fid" value="<%=fid %>"
		readonly="readonly" /> <Br/><br/>
		Student Name : 
		<input type='text' name="studentName" value="<%=studentName %>"
		readonly="readonly" /> <br/><br/> 
		Instructor : 
		<input type='text' name="instructor" value="<%=instructor %>"
		readonly="readonly" /> <br/><br/>
		Subject : 
		<input type='text' name="subject" value="<%=subject %>"
		readonly="readonly" /> <br/><br/>
		Feedback : 
		<input type='text' name="feedback" value="<%=feedback %>"
		readonly="readonly" /> <br/><br/>
		<input type="submit" value="Confirm Please" />
	</form>
</body>
</html>