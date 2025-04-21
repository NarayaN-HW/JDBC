<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Show Department(s)</title>
</head>
<body bgcolor="pink">
	<h2>Build Department</h2>
	<%-- Obtaining the bean: dept type Department session scope--%>
	<jsp:useBean id="dept" class="example.jdbc.Department" scope="session" />
	<%-- Showing properties of Department --%>
	<h2>
		Dept Number:
		<jsp:getProperty property="deptNo" name="dept" /></h2>
	<h2>
		Dept Name:
		<jsp:getProperty property="dName" name="dept" /></h2>
	<h2>
		Dept Location:
		<jsp:getProperty property="loc" name="dept" /></h2>
</body>
</html>