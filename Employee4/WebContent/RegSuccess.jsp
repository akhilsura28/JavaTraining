<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome to TalentSprint</h2>
	
	<p> You have successfully registered !</p>
	<p> Your Employee Id is <%= request.getAttribute("empId") %></p>
	
	<p> click <a href="./login.html">here</a> to login </p>
	
	

</body>
</html>