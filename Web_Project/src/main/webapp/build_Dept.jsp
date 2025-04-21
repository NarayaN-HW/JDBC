<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Build Department</title>
</head>
<body>
	<h2>Build Department</h2>
	<%--Building java bean of type example.jdbc.Department,
	 session scope because i send 2 request so higher the scope--%>

	<jsp:useBean id="dept" class="example.jdbc.Department" scope="session" />

	<%-- Assigining values of properties of bean  bean name="dept" * =all properties=variables--%>
	<jsp:setProperty property="*" name="dept" />

	<%-- Display html msg and link--%>
	<h2>Department Created Successfully.</h2>
	<h2>
		To View <a href="showDept.jsp">Click Here</a>
	</h2>
</body>
</html>