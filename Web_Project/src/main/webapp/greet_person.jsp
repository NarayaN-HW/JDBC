<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Greet Person</title>
</head>
<body bgcolor = "yellow">
	<h2>Greeting person Hello Indian</h2>
	<%
	String name = request.getParameter("name");
	String greetingmsg = request.getParameter("greeting");
	%>
	<h2><%=greetingmsg%>
		The name is
		<%=name%></h2>

</body>
</html>