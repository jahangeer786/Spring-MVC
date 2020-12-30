<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>
</head>
<body>
	This is Contact page
	
	 <%= request.getAttribute("name") %>, welcome to the help page <br>
	 
	Your contact is <%= request.getAttribute("contactNumber") %>
	 	
	<h1>Url /Contact</h1>

</body>
</html>