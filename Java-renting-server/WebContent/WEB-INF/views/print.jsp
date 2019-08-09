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
String userName = request.getParameter("uname");

%>

<form action ="Owner_Details">
<input type="hidden" name="uname" value="<%=userName%>"> 
<label>click for owner details</label>
<input type="submit">

</form>

<form  action ="AllHouses">
<label>click for house details</label>
<input type="submit">

</form>

</body>
</html>