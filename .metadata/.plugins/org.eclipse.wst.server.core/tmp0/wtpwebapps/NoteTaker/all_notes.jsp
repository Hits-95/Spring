<%@page import="java.util.List"%>
<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Notes</title>
<%@include file="/all_js_css.jsp"%>

</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>All Notes</h1>
		<div class="row">
			<div class="col-12">
				<!-- Fetch all notes  -->
				<%
					Session s = FactoryProvider.getFactory().openSession();
					Query Q_obj = s.createQuery("from Note");
					List<Note> list = Q_obj.list();

					for (Note note : list) {
				%>
				<div class="card mt-2 bg-light">
					<img class="card-img-top  m-4 mx-auto" style="max-width: 100px"
						src="./img/note.png" alt="Card image cap">
					<div class="card-body px-5">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<b><p class="text-primary text-right "><%=note.getAddedDate()%></p></b>
						<div class="text-center">
							<a href="./edit.jsp?note_id=<%=note.getId()%>"
								class="btn btn-primary">Update</a> <a
								href="DeleteServlet?note_id=<%=note.getId()%>"
								class="btn btn-danger">Delete</a>
						</div>
					</div>
				</div>
				<%
					}
					s.close();
				%>
			</div>
		</div>
	</div>
</body>
</html>