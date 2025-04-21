<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Person Entry</title>
</head>
<body bgcolor="aqua">
	<h2>Person Entry</h2>
	<h2>Enter your details:</h2>
	<form action="check_country.jsp" method="post">
		<pre>
				<h2>Name:</h2>
				<input type="text" name="name" />
				
				<h2>Country of Residence:</h2>
				<input type="text" name="country" />
				
				<input type="submit" name="Submit" />
			</pre>
	</form>
</body>
</html>