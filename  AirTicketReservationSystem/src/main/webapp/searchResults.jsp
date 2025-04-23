<%@page import="com.airline.entiry.Flight"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Search Results</title>
<style type="text/css">
#box {
	background-color: yellow;
	margin: 100px;
	padding: 0;
	font-family: Arial, sans-serif;
}

#p {
	background-color: yellow;
	margin: 100px;
	padding: 0;
	font-family: Arial, sans-serif;
}

.flight-info {
	background-color: yellow;
	margin: 20px;
	padding: 15px;
	border-radius: 8px;
	box-shadow: 2px 2px 5px gray;
}
</style>
</head>
<body bgcolor="lightgreen">
	<div id="box">
		<h1>🎶✈️Search Results✈️🎶</h1>
		<%
		List<Flight> flights = (List<Flight>) request.getAttribute("flights");
		for (Flight f : flights) {
		%>
		<p>
			Flight number:
			<%=f.getFlightNumber()%>
			<br> <br> Flight Date:
			<%=f.getFlightDate()%>
			<br> <br> Flight Source:
			<%=f.getSource()%><br> <br> Flight Destination:
			<%=f.getDestination()%><br> <br> Flight Price:
			<%=f.getPrice()%><br> <br>
			
		<form action="bookflight" method="post">
			<input type="hidden" name="flightId" value=<%=f.getId()%>></input>
			<button>Book</button>
		</form>
		<hr />

		</p>
		<%
		}
		%>


	</div>
</body>
</html>