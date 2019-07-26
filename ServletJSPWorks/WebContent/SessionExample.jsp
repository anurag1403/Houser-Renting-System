<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Your Company name is <%= application.getAttribute("company") %></h2>
<%
	HttpSession mysession = request.getSession();
	if(mysession.isNew()) {
		%>
			<p>Hi user welcome for first time</p>
		<%
	}
	else{
		mysession.setMaxInactiveInterval(5);
		%>
			<p>Hi user welcome back</p>
			<p>your last session id is : <%= mysession.getId() %></p>
			<p>Creating time is : <%= new Date(mysession.getCreationTime()) %></p>
			<p>Last access time is : <%= new Date(mysession.getLastAccessedTime()) %></p>
			<p> Max inactive interval is : <%= mysession.getMaxInactiveInterval() %>
	<%
	mysession.invalidate();
	}
%>
</body>
</html>