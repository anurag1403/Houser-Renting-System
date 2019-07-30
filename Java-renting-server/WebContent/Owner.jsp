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

    <form action="Owner">
    <input type="hidden" name="uname" value="<%=userName%>"> 
      <label>First Name</label>
    <input type="text" name="name"  placeholder="name"  required><br />
    
     <label>emailId</label>
    <input type="text" name="emailId"  placeholder="emailId"  required><br />
     <label>address</label>
    <input type="text" name="address"  placeholder="address"  required><br />
     <label>phoneNo</label>
    <input type="text" name="phone_no"  placeholder="phoneNo"  required><br />
     <label>bankBranch</label>
    <input type="text" name="bankBranch"  placeholder="bankBranch"  required><br />
     <label>bankAccountNo</label>
    <input type="text" name="bankAccountNo"  placeholder="bankAccountNo"  required><br />

      <input type="submit" value="submit">
    </form>
 


</body>
</html>