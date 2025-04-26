<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Book</title>

<style type="text/css">
#box {
	margin: auto;
	width: 400px;
	padding: 20px;
	border: 2px solid red;
	background-color: #f9f9f9;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}
</style>
</head>
<body bgcolor="yellow">
	<div id="box">
		<h1>📖📕📚Add Book📖📕📚</h1>
		<form action="addbook" method="post">
			Title: <input type="text" name="title"> <br> <br>
			Price: <input type="text" name="price"> <br> <br>
			Publication year: <input type="text" name="year"> <br> <br>
			Author name: <input type="text" name="name"> <br> <br>
			Author email: <input type="text" name="email"> <br> <br>
			Author Country: <input type="text" name="country"> <br>
			<br> <input type="submit" value="Submit">
	</div>
</body>
</html>