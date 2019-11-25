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
	<sf:form modelAttribute="pizza">

		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />

		<sf:radiobutton path="size" label="small" value="small" />
		<sf:radiobutton path="size" label="medium" value="medium" />
		<sf:radiobutton path="size" label="large" value="large" />

		<br>
		<b>Toppings:</b>
		<br>

		<sf:checkboxes items="${toppingList}" path="toppings"
			delimiter="&lt;br/&gt;" />
		<br>
		<input type="submit" name="_eventId_addPizza" value="continuar" />
		<br><br>
		<input type="submit" name="_eventId_cancel" value="cancelar" />



	</sf:form>


</body>
</html>