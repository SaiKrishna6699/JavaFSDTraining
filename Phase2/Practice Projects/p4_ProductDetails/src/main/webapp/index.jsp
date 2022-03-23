<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
<style>
body {
	background-color: #2b0403;
	color: #ffffff;
}

button {
	background-color: #032b15;
	color: #ffffff;
}
</style>
</head>
<body>

	<h1>Enter Product Details</h1>
	<form action="App">
		<input type="text" name="productId" placeholder="PRODUCT ID"><br>
		<br /> <input type="text" name="productName"
			placeholder="PRODUCT NAME"><br> <br /> <input
			type="text" name="productPrice" placeholder="PRODUCT PRICE"><br>
		<br />
		<button>Submit</button>
	</form>

</body>
</html>
