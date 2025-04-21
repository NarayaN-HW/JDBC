<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.time.LocalDate, java.time.LocalTime"%>
<!DOCTYPE html>
<html>

<body>
	<h2 style="color: black; background-color: pink; text-align: center;">Welcome
		to the Demonstration of several JSP tags.</h2>
	<%-- Including the resource greetjsp.html linking html into JSP tag>Directives>include--%>
	<%@ include file="greetjsp.html"%>


	<%-- Defining some var and method --%>
	<%!int num = 101;

	public String sayGreeting(String name) {
		return "Welcome: " + name;
	}%>

	<%-- Showing the Square of the number --%>
	<h2>
		Square of
		<%=num%>
		is
		<%=(num * num)%>

	</h2>
	<h2><%=sayGreeting("LordShiva")%></h2>

	<%-- Printing hellow 5 times in h2 heading styles --%>
	<%
	for (int i = 1; i <= 5; i++) {
	%>
	<h2>
		Hel
		<%=i%></h2>
	<%
	}
	%>

	<%-- Showing Current localDate and LocalTime --%>
	<%
	LocalDate systemDate = LocalDate.now();
	LocalTime systemTime = LocalTime.now();
	%>
	<h2>
		Today's Date:
		<%=systemDate%></h2>
	<h2>
		Today's time:
		<%=systemTime%></h2>

</body>
</html>