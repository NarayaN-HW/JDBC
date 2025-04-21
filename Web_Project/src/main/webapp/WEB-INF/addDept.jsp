<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Addition Department</title>
</head>
<body>
	<h2>Department Entry Form</h2>

	<!-- name under lable or h2 tab same name is dept mem var -->

	<form action="demo.jsp" method="post">
		<label for="deptNo">Department Number:</label><br> <input
			type="text" id="deptNo" name="deptNo"
			style="background-color: pink; color: black;"><br> <br>
		<label for="dName">Department Name:</label><br> <input
			type="text" id="dName" name="dName"
			style="background-color: pink; color: black;"><br> <br>
		<label for="loc">Location:</label><br> <select name="loc">
			<option>SELECT</option>
			<option value="Shahada">Shahada</option>
			<option value="Nashik">Nashik</option>
			<option value="Pune">Pune</option>
			<option value="Kedarnath">Kedarnath</option>
			<option value="Mumbai">Mumbai</option>
		</select><br> <br> <input type="submit" value="Submit">
	</form>

</body>
</html>