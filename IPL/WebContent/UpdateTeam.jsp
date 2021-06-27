<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	  
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>

		<body class="container" style="margin-top:20px">
		
		<h2> UPDATE THE TEAM :</h2>
		
		<form action="ServletController">
			
		<div style="margin-top:20px">		
			<span class="alert alert-primary">TEAM ID :</span> <input type="text" name="team_id" value="${oldT.team_id}" readonly><br><br>
			<span class="alert alert-primary">TEAM NAME :</span> <input type="text" name="team_name" value="${oldT.team_name}"><br><br>
			<span class="alert alert-primary">CITY :</span> <input type="text" name="city" value="${oldT.city}"><br><br>
			<span class="alert alert-primary">STATE :</span> <input type="text" name="state" value="${oldT.state}"><br><br>
			<span class="alert alert-primary">CAPTAIN :</span> <input type="text" name="captain" value="${oldT.captain}"><br><br>	
			
			<input class="alert alert-danger" type ="submit" name="action" value="UPDATE">			
		</div>
				
		</form>	
		
		</body>
				
</html>