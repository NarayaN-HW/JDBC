<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>LoggedIn</title>
</head>
<body = bgcolor="lightpink">
	<%-- Fetching Session an app level info --%>
	<%
	Object loggedInUser = session.getAttribute("loggedInUser");
	Object greetingMsg = session.getAttribute("greetingMsg");

	Object comanyPolicy = application.getAttribute("ourCompanyPolicy");
	%>
	<h2><%=greetingMsg%>
		<%=loggedInUser%></h2>
	<h2>This is our Company Policy:</h2>
	<h2><%=comanyPolicy%></h2>
</body>
</html>