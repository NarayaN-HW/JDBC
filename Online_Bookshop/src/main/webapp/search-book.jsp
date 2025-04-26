<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Search Book</title>

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
		<form action="searchbook" method="post">
			<h1>📖📕📚Search Book📖📕📚</h1>
			Enter Book Title: Enter Book Title: <input type="text" name="title"><br>
			<br> <br> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>