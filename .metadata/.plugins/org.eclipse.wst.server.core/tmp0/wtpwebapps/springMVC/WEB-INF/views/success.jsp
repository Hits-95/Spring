<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<div class="text-center">
		<h1 class="text-primary">${head }</h1>
		<p>${desc }</p>
	</div>
	<hr>
	<h1>WelCome, ${user.userName }</h1>
	<h2>Your Email id is ${user.email }</h2>
	<h2>Your password is ${user.userPassword } try to secure it.</h2>

</body>
</html>