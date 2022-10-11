<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Language</title>
</head>
<body>
<form action="" method="post">
<h3>View Details</h3>
<label>Select Language: </label>
<select name="language">
  <option value="C">C</option>
  <option value="C++">C++</option>
  <option value="Java">Java</option>
  <option value="Other">Other</option>
</select><br>
<input type="submit" value="Submit">
</form>

<%
String language = request.getParameter("language");
if(language != null){
%>
<table>
<tr>
<td>First Name</td>
<td>Last Name</td>
<td>Gender</td>
<td>Phone Number</td>
<td>Email Id</td>
<td>Languages</td>
<tr>
<%
try{
Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","12345");
ResultSet rs=null;
if(language.equals("Other"))
{
	PreparedStatement ps = con.prepareStatement("select i.firstname,i.lastname,i.gender,i.phonenumber,i.email,l.lang from information i,language l where i.firstname = l.firstname ");
	rs = ps.executeQuery();}	
else{
PreparedStatement ps = con.prepareStatement("select i.firstname,i.lastname,i.gender,i.phonenumber,i.email,l.lang from information i,language l where i.firstname = l.firstname and l.lang = ?");
ps.setString(1, language);
rs = ps.executeQuery();}
%>
<%while(rs.next()){ %>
<tr>
<td><%=rs.getString("firstname")%></td>
<td><%=rs.getString("lastname")%></td>
<td><%=rs.getString("gender")%></td>
<td><%=rs.getString("phonenumber")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getString("lang")%></td>
</tr>
<%} %>
<%
}
catch(ClassNotFoundException e){
e.printStackTrace();
}

} %>
</table>
</body>
</html>
