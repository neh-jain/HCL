<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action="Registration" method="post">
<table>
	<tr>
	<td>First Name</td><td><input type="text" name="fname" required></td>
	</tr>
	<tr>
	
	<td>Last Name</td><td><input type="text" name="lname"></td>
	</tr>
	<tr>
	<td>Gender</td><td><input type="radio" name="gender" value="male">Male
	<input type="radio" name="gender" value="female">Female</td>
	</tr>
	<tr>
	<td>Phone Number</td><td><input type="number" name="phone" required></td>
	</tr>
	<tr>
	<td>Email</td><td><input type="email" name="email" required></td>
	</tr>
	<tr>
	<td>Language</td><td><input type="checkbox" name="lang" value="C">C
	<input type="checkbox" name="lang" value="C++">C++
	<input type="checkbox" name="lang" value="java">Java
	</td>
	</tr>
	<tr><td><input type="submit" value="Submit"></td>
	</tr>
</table>
</form>
</body>
</html>