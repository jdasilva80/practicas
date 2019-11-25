<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome!!!</h2>
	<sf:form modelAttribute="order">

		${flowExecutionKey}
		<br>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<br>
		<input type="text" name="phoneNumber" />
		<br>
		<br>
		<input type="submit" name="_eventId_phoneEntered"
			value="look up customer" />

	</sf:form>


</body>
</html>