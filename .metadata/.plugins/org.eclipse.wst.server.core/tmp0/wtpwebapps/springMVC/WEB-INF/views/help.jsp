<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
		/* int id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>
		Id : ${id }


		<%-- <%=id%> --%>
	</h1>
	<h1>
		Name : ${name }
		<%-- <%=name%> --%>
	</h1>
	<h1>
		${time}
		<%-- <%=time%> --%>
	</h1>
	<hr>
	<c:forEach var="item" items="${marks }">
		<%-- <h1>${item }</h1> --%>
		<h1>
			<c:out value="${item }"></c:out>
		</h1>
	</c:forEach>
</body>
</html>