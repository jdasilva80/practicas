<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>TAKE PAYMENT!!!</h2>
	
	<sf:form modelAttribute="paymentDetails">

		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />

		<sf:input path="creditCard"/>
		<br>
		<sf:checkboxes items="${paymentTypeList}" path="paymentType"
			delimiter="&lt;br/&gt;" />
		<br>		
		<br>
		<input type="submit" name="_eventId_submit" value="submit" />
		<br>
		<input type="submit" name="_eventId_cancel" value="cancel"/>


	</sf:form>


</body>
</html>