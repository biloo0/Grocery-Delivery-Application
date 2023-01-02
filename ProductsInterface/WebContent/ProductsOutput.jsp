<%@page import="main.Products"%>
<%@page import="main.ProductsProxy"%>
<%@page import="main.ProductDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grocery Delivery System</title>
</head>
<body>
<h1>Grocery Delivery System</h1>
<%
Products bp = new ProductsProxy().getProducts();
%>
<label>Available Items</label>
<% 
ProductDetails[] products = bp.getItems(request.getParameter("Categories"));
for(int i=0; i<products.length; i++){
	out.println("<br>ProductsName: " + products[i].getProductname());
	out.println("<br>ProductNumber: " + products[i].getProductnumber());
	out.println("<br>Price: " + products[i].getPrice());
	
}
%>
</body>
</html>