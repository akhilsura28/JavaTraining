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
	
		<h2>ADD A NEW TEAM :</h2>
		
		<form action="ServletController" method="post">
		
				<div>
				<span class="input-group-text">TEAM ID :</span> <input type="text" name="newTeamId" value= "${newTeamId}" readonly>
				</div><br>
				
				<span class="input-group-text">TEAM NAME :</span> <input type="text" name="teamName" ><br>
				<span class="input-group-text">CITY :</span> <input type="text" name="cityName" ><br>
				<span class="input-group-text">STATE :</span> <input type="text" name="stateName" ><br>
				<span class="input-group-text">CAPTAIN :</span> <input type="text" name="captainName" ><br>
				<br><br>
				<input class="alert alert-primary" type ="hidden" name="action" value="add_the_team">
				<input class="alert alert-primary" type ="submit" value="SUBMIT">
		</form>
		
	</body>
</html>