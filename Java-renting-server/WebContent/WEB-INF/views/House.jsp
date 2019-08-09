<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="house">
		<input type="hidden" name="username" value=${username}> <label>House
			name</label> <input type="text" name="Hname" placeholder="name" required><br />

		<label>cost</label> <input type="text" name="cost" placeholder="cost"
			required><br /> <label>address</label> <input type="text"
			name="address" placeholder="address" required><br /> <label>broker</label>
		<select name="broker" id="broker">
			<option value="broker">broker</option>
			<option value="no broker">no broker</option>
		</select> <label>select</label> <select name="s" id="s">
			<option value="rent">rent</option>
			<option value="sell">sell</option>
		</select> <label>select</label> <select name="a" id="a">
			<option value="apartment">apartment</option>
			<option value="house">house</option>
		</select> <label>select</label> <select name="f" id="f">
			<option value="family">family</option>
			<option value="bachelor">bachelor</option>
		</select> <label>select</label> <select name="b" id="b">
			<option value="2bhk">2bhk</option>
			<option value="3bhk">3bhk</option>
		</select> <input type="submit" value="submit">
	</form>


</body>
</html>