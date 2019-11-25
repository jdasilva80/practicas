<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show order</title>
</head>
<body>
	<h1>SHOW ORDER !!</h1>
	
	<br>
	${order}
	<br>

	<a href="${flowExecutionUrl}&_eventId=createPizza">Create</a>
	<br>
	<br>
	<a href="${flowExecutionUrl}&_eventId=orderCreated">Checkout</a>
	<br>
	<br>
	<a href="${flowExecutionUrl}&_eventId=cancel">Cancel</a>
</body>
</html>