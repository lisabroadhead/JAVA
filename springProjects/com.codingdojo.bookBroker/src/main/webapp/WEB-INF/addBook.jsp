<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Broker</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="container">
		<nav>
			<a href="/bookmarket">Dashboard</a> |
			<a href="/add/book">Add Book</a> |
			<a href="/update/book">Update Book</a> |
			<a href="/book">Book</a> |
			<a href="/logout">Logout</a>
		</nav>
		<h1>Add Book </h1>
		
		<form:form method="post" action="/api/add/book" modelAttribute="book">
			<div>
				<span>
					<form:label path="title">Title</form:label>
					<form:errors path="title"/>
				</span>
				<form:input path="title" type="text"/>
			</div>
			
			<div>
				<span>
					<form:label path="author">Author</form:label>
					<form:errors path="author"/>
				</span>
				<form:input path="author" type="text"/>
			</div>
			
			<div>
				<span>
					<form:label path="review">Thoughts</form:label>
					<form:errors path="review"/>
				</span>
				<form:input path="review" type="text"/>
			</div>
			
			<input type="hidden" name="user" value="${logged.id }" />
			<input type="submit" value="Add Book" class="submit" />
		</form:form>
	</div>
</body>
</html>