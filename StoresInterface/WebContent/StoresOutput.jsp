<%@ page import = "main.*" %>

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
Stores bp = new StoresProxy().getStores();
%>
<label>Available Stores</label>
<%= bp.getStores(Integer.parseInt(request.getParameter("Ratings")))%>
</body>
</html>