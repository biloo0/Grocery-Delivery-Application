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
<form action = "RiderDetailsOutput.jsp">

<label>Bikes</label>
<select name="Bikes">
<option value="Honda">Honda</option>
<option value="Deluxe">Deluxe</option>
<option value="Yamaha">Yamaha</option>
<option value="Suzuki">Suzuki</option>
<option value="Unique">Unique</option>
</select>
<br>
<br>
<button type="Submit">Get Riders</button>
</form>

</body>
</html>