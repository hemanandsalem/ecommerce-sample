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
		<div clas="container">
			<div class="row mt-5">
				<div class="col d-flex justify-content-center">
					<h2>Your Cart</h2>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col d-flex justify-content-center">
					<spring:url value="/ecommerce/login" var="loginURL" />
					<form:form modelAttribute="productModel" method="post" action="${loginURL }" cssClass="form">
					<div class="row">
						<table class="table table-stripped table-bordered">
							<thead>
								<tr>
									<th align="center">S.No</th>
									<th align="center">Product Name</th>
<!-- 									<th align="center">Description</th> -->
									<th align="center">Price</th>
									<th align="center">Quantity</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${productList.products}" var="product" varStatus="status">
									<tr scope="row">
										<td align="center">${product.productId}</td>
										<td align="center"><input name="products[${status.index}].productName" value="${product.productName}" readonly="true" /></td>
<%-- 										<td align="center"><input name="product.description" value="${products.description}" readonly="true" /></td> --%>
										<td align="center"><input name="products[${status.index}].price" value="${product.price}" readonly="true" /></td>
										<td align="center"><input name="products[${status.index}].quantity" value="${product.quantity}" readonly="true"/></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="row  mt-3">
						<div class="col d-flex justify-content-between">
							<input class="btn btn-primary" type="submit" value="Place Order">
							<spring:url value="/ecommerce/orders" var="orders" />
							<a class="btn btn-primary" href="${orders }" role="button">My Orders</a>
						</div>
					</div>
						
					</form:form>
				</div>
			</div>
		</div>

<%-- <c:forEach items="${productList}" var="product"> --%>
<%-- 	${product.productName} --%>
<%-- 	${product.price} --%>
<%-- 	${product.stock} --%>
<%-- </c:forEach> --%>
	</body>
</html>