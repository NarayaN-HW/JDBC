<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Valid</title>
</head>
<body bgcolor="AliceBlue">
	<%
	Object successmsg = request.getAttribute("successMessage");
	Object currentuser = session.getAttribute("loggedInUser");
	%>
	<h2 style="color: black; background-color: yellow;"><%=currentuser%>
		Successfully LogIn....
	</h2>

</body>
</html>