<%@page import="com.bookshop.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Search Result</title>

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

		<h1>📖📕📚Result Book Details📖📕📚</h1>
		<%
		Book Objbook = (Book) request.getAttribute("book");
		%>
		<h1 style='color: green'><%=Objbook.getTitle()%></h1>
		<br> <br>
		<h2>
			Book ID:
			<%=Objbook.getBookId()%>
		</h2> 
		<br> <br>
		<h2>
			Book Publication Year:
			<%=Objbook.getPublicationYear()%></h2>
		<br> <br>
		<h2>
			Book Author:
			<%=Objbook.getAuthor()%>
		</h2>
		<br> <br>

	</div>
</body>
</html>