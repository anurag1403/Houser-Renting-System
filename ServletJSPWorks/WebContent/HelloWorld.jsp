<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%! 
	public void jspInit(){
		System.out.println("Hi I'm from init");
	}
	public void jspDestroy(){
		System.out.println("Hi I'm from destroy");
		
	}
%>


<body bgcolor = "cyan">
	<h2 color ="orange">Welcome to jsp</h2>
	<a href = "getemps"> Get all employees</a>
	<%
	Date date = new Date();
	out.print("Today's date is " + date.toGMTString());
	application.setAttribute("company", "Publicis Sapient");
	%>
</body>
</html>