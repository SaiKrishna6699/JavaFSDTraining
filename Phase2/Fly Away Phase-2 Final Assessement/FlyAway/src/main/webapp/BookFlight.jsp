<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
<style>
	body{
	color: #000000;
	background-color: #c6f7d9;
	font: 15px;
	}
	h1{
	font: 30px;
	}
	a {
 	color: black;
 	text-decoration: none;
	}
	a:link {
  	color: green;
  	background-color: transparent;
  	text-decoration: none;
	}
	a:active {
  	color: red;
  	background-color: transparent;
  	text-decoration: underline;
	}
</style>
</head>
<body>
	<br>
	<a href=HomePage.jsp
		style="color: black; text-decoration: none; font-size: 35px; fontweight: bold;">Flight
		Booking</a>
	<br>
	<br>
	<%
	@SuppressWarnings("unchecked")
	HashMap<String, String> user = (HashMap<String, String>) session.getAttribute("user");
	if (user == null) {
		response.sendRedirect("UserPage.jsp");
	}
	%>
	<p align="center"
		style="color: green; font-size: 40px; font-weight: bold">Flight
		Booked Successfully</p>
</body>
</html>