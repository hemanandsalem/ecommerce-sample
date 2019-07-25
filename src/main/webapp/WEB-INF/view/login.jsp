<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
		<title>Shopping|Products</title>
	</head>
	<body>
	<spring:url value="/ecommerce/login" var="loginURL" />
	<form:form modelAttribute="credentials" method="post" action="${loginURL }" cssClass="form">
	<input name="username" type="text" placeholder="Enter your username" />
	<input name="password" type="password" placeholder="Enter password" />
	<input name="address" type="text" placeholder="Enter your delivery address" />
	<div name="warning" value="$errormessage" display=$shouldShow />
	<input class="btn btn-primary" type="submit" value="Login">
	</form:form>
	</body>
</html>