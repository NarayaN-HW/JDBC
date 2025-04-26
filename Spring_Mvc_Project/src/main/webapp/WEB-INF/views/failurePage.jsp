<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Invalid</title>
</head>
<body >
	<%
	Object failuremsg = request.getAttribute("failureMessage");
	%>

	<h2><%=failuremsg%>  Not LogIn !!!
	</h2>
</body>
</html>