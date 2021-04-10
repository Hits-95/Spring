<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="link.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div class="container">
		<div class="card mx-auto mt-5 bg-primary" style="width: 50%;">
			<!-- <img src="..." class="card-img-top" alt="..."> -->
			<div class="card-body py-5">
				<h3 class="text-center text-white">My Search</h3>
				
				<form class="mt-5" action="search">
					<div class="mb-3">
						<input type="text" class="form-control" id="querybox"
							name="querybox" placeholder="Enter your search..">
					</div>
					<div class="container text-center">
						<button type="submit" class="btn btn-outline-light">Search</button>
					</div>
				</form>
				
			</div>
		</div>
	</div>

</body>
</html>