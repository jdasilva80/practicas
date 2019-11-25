<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Registration form!!!</h2>

	<sf:form modelAttribute="customer" method="POST">

		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<br>
		<b>Phone Number: </b>
		<sf:input path="phoneNumber" />
		<br />
		<b>Nombre: </b>
		<sf:input path="nombre" />
		<br />
		<b>Apellidos: </b>
		<sf:input path="apellidos" />
		<br />
		<b>Zip code: </b>
		<sf:input path="zipCode" />
		<br />
		<input type="submit" name="_eventId_submit" value="submit" />
		<input type="submit" name="_eventId_cancel" value="cancel" />

	</sf:form>

</body>
</html>