<%@include file="link.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>File Upload Success</title>
</head>
<body>
	<div class="container mt-5">
		<div class="card bg-dark text-white">
			<img src="<c:url value = "/resources/upload/${filename }" />"
				class="card-img" alt="Profile-img">
			<div class="card-img-overlay">
				<h5 class="card-title">${msg }</h5>

			</div>
		</div>
</body>
</html>