<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="link.jsp"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error-page</title>
</head>
<body>
	<div class="container p-5">
		<div class="text-center">
			<h2>Oops! Sorry</h2>
			<div class="alert alert-danger" role="alert">
				${msg }
			</div>
			<h3>Something wents wrong!!!</h3>
			<p>Sorry ! Exception is occure try again</p>
			<a href="home">Back to Home</a>
		</div>

	</div>

</html>
</body>