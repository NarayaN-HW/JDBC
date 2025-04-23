<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<style type="text/css">
#box {
	background-color: pink;
	margin: 100px;
	padding: 0;
	font-family: Arial, sans-serif;
}
</style>
</head>
<body bgcolor="aqua">
	<div id="box">
		<h1>🎶 Search🎶</h1>

		<form action="search" method="post">
			From:<input type="text" name="from"><br> <br> To:<input
				type="text" name="to"><br> <br> Date:<input
				type="date" name="date"><br> <br> <input
				type="submit" value="Search">
		</form>
		<a href="deleteflight.jsp">Delete Flight</a>
	</div>
</body>
</html>