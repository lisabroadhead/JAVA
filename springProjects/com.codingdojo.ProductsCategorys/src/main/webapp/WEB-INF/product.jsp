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
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<div class="container">
	<nav>
		<a href="/dashboard">Dashboard</a>
		<a href="/categories">Categories</a>
		<a href="/products">Products</a>
		<a href="/add/product">Add Product</a>
		<a href="/add/category">Add Category</a>
	</nav>
	
		<h1><span>Product - </span> ${product.name}</h1>
		
		<form method="post" action="/api/product/category" >
			<select name="product">
				<c:forEach var="cat" items="${categories }">
					<option value="${cat.id}">${cat.name }</option>
				</c:forEach>
			</select>
			
			<input type="hidden" name="category"  value="${product.id}" />
			
			<input type="submit" class="submit"/>
		</form> 
		
	</div>
</body>
</html>