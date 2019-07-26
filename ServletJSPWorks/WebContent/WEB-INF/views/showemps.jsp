<%@page import ="training.jdbc.beans.Employee"%>
<%@page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th> Employee Id </th>
<th> Employee Name </th>
<th> Employee Email </th>
<th> Employee DOB </th>
<th> Employee Department Id </th>
<th> Employee Salary</th>
</tr>
<% 
	List<Employee> list = (List<Employee>) request.getAttribute("EMPS");
	for(Employee temp:list) {
		%>
	<tr>
		<td><%= temp.getEmpId() %></td>
		<td><%= temp.getEmpName() %></td>
		<td><%= temp.getEmpEmail() %></td>
		<td><%= temp.getEmpDob() %></td>
		<td><%= temp.getDeptId() %></td>
		<td><%= temp.getEmpSalary() %></td>
	</tr>
	<%
	}
%>
</table>
</body>
</html>