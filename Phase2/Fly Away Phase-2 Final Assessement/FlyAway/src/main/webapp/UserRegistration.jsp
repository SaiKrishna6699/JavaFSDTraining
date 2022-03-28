<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
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
	<center>
	<div
		style="border: 3px solid black; width: 25%; border-radius: 20px; padding: 20px"
		align="center">
		<form action=UserRegistration method=post>
			<label for=email>Email :-</label> <input type="email" name=email
				id=email /><br>
			<br> <label for=pass>Password :-</label> <input type="password"
				name=password id=pass /><br>
			<br> <label for=name>Name :-</label> <input type="text"
				name=name id=name /><br>
			<br> <label for=phno>Phone No. :-</label> <input type="text"
				name=phno id=phno /><br>
			<br> <label for=adno>Aadhaar No. :-</label> <input type="text"
				name=adno id=adno /><br>
			<br> <input type=submit value=submit /> <input type=reset />
		</form>
	</div>
	</center>
</body>
</html>