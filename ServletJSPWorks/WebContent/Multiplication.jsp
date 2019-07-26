<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "MultiplicationForm.jsp" %>

	<h2>Multiplication Table</h2>
	<table border = "3" border-color = "cyan">
	<%
		try{
		int val = Integer.parseInt(request.getParameter("val"));
		out.println("Multiplication Table for " + val);
		for(int i = 1; i <= 10; i++) {
	%>
			<tr><td>	
			<%= val %> X <%= i %> = <%= val * i %>
			</td></tr>
	<%
		}
		}
		catch(NumberFormatException e){
			e.printStackTrace();
	%>
		<h2> Sorry inputed value is not a number</h2>
	<%
		}
	%>
	</table>
</body>
</html>