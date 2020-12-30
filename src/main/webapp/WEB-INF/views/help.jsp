<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	This is Help page
	
	 <%= request.getAttribute("name") %>, welcome to the help page <br>
	 
	 Your Hobbies are <br>
	 
	 <% java.util.ArrayList<String> hobbies = (java.util.ArrayList<String>)request.getAttribute("hobbies"); 
	 
	 	for(String s : hobbies){
	 		out.println(s);
	 	}
	 %>
	 	
	<h1>Url /help</h1>
</body>
</html>