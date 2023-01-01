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
<form action = "StoresOutput.jsp"> 

<label>Ratings</label>
<select name="Ratings">
<option value="5">5</option>
<option value="4">4</option>
<option value="3">3</option>
<option value="2">2</option>
<option value="1">1</option>
</select>
<br>
<br>
<button type="Submit">Get Stores</button>
</form>
</body>
</html>