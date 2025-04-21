<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Login JSP</title>
</head>
<body bgcolor="aquablue">
	<h2>Login Page</h2>
	<form action="doLogin" method="post">
		<pre>	
			<h2>UserName: </h2>
			<input type="text" name="userName" />
			
			<h2>Password: </h2>
			<input type="password" name="password" />
			
			<input type="submit" value="Sign-In">
		</pre>
	</form>
</body>
</html>