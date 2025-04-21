<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>check Country</title>
</head>
<body bgcolor="floralwhite">
	<h2>Check Country</h2>
	<%--Checking the country of residence --%>
	<%
	String countryName = request.getParameter("country");
	if (countryName.equalsIgnoreCase("india")) {
	%>
	<jsp:forward page="greet_person.jsp">
		<jsp:param value="Welcome" name="greeting" />
	</jsp:forward>
	<%
	} else {
	%>
	<h2>Sorry, this service is not available in your country. Try
		again.</h2>
	<jsp:include page="person_entry.jsp"></jsp:include>

	<%
	}
	%>
</body>
</html>