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
		<script src="/webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<script src="/webjars/jquery/3.0.0/jquery.min.js"></script>
		<style type="text/css">
			.bg {
  /* The image used */
  background-image: url("https://mdbootstrap.com/img/Photos/Horizontal/Nature/full page/img(11).jpg");

  /* Half height */
  height: 50%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
		</style>
	</head>
	<body>
	<form:form modelAttribute="orderDetails" method="post" action="${myCartURL }" cssClass="form">
	<input name="username" type="text" placeholder="Enter your username" />
	<input name="password" type="password" placeholder="Enter password" />
	<input name="address" type="text" placeholder="Enter your delivery address" />
	<input type="hidden" name="productModel" value="${productList.products}"/>
	<input class="btn btn-primary" type="submit" value="Confirm Order">
	</form:form>
	</body>
</html>