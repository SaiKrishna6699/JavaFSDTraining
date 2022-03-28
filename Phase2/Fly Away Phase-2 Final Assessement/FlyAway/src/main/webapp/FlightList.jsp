<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight List</title>
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
	List<String[]> flights = (List<String[]>) session.getAttribute("flights");
	if (flights != null) {
	%>
	<h1>Available Flights</h1>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Time</th>
			<th>Price</th>
		</tr>
		<%
		for (String[] flight : flights) {
		%>
		<tr>
			<td><%=flight[0]%></td>
			<td><%=flight[1]%></td>
			<td><%=flight[2]%></td>
		</tr>
	</table>
	<a href=BookFlight.jsp>Book Now</a>
	<%
	}
	%>
	<%
	} else {
	%>
	<center>
	<!--  -->
	<br/>
	<br/>
	<br/>
	<h2>There are no available flights</h2>
	</center>
	<%
}
%>
</body>
</html>