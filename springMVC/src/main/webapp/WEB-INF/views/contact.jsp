<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<title>Contact Form</title>
</head>
<body>
	<div class="container mt-5 ">
		<h1 class="text-center text-primary">${head }</h1>
		<p class="text-center">${desc }</p>
		<hr>
		<h1 class="m-3">Registration Form</h1>

		<form action="processform" method="post">
			<div class="mb-3">
				<label for="email" class="form-label">Email address</label> 
				<input
					type="email" class="form-control" 
					id="email"
					aria-describedby="emailHelp" 
					placeholder="Enter Here...."
					name = "email"
					>
			</div>

			<div class="mb-3">
				<label for="userName" class="form-label">User Name</label> <input
					type="text" class="form-control" id="userName"
					aria-describedby="emailHelp" placeholder="Enter Here...." name="userName">
			</div>

			<div class="mb-3">
				<label for="userPassword" class="form-label">Pass Word</label> <input
					type="password" class="form-control" id="userPassword"
					aria-describedby="emailHelp" placeholder="Enter Here...." name="userPassword">
			</div>

			<div class=" container text-center">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>

</body>
</html>