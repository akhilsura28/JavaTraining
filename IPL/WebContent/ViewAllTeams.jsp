<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "team_beans.Team"%>
<%@	page import = "java.util.*" %>
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

		<%
			Date date = Calendar.getInstance().getTime();
			String today = date.toString();
		%>

		<body style="height:1500px">
		
		<div class="container" style="margin-top:10px">
		<h4 style="color:blue" class="text-uppercase">LOGIN TIME : <%= today %> </h4>
		</div>
		
		<div class="row">
				  <div class="CONTAINER col-sm-4">
				
					 <img src = "images/ipl2.jpg" alt = "not found" > 
						  
						 
				  </div>
						
			
				<div class="col-sm-8"> 
						<div class="container" style="margin-top:30px">
		
								<form action="ServletController" >
										<table class="table table-hover">
											<thead>
													<tr>
														<th>SELECT</th>
														<th>TEAM ID</th>
														<th>TEAM NAME</th>
														<th>CITY</th>
														<th>STATE</th>
														<th>CAPTAIN</th>			
													</tr>
											</thead>
																
													<c:forEach items="${ListOfTeam}" var="team">
													<tbody>
														<tr>
															<td><input type="radio" id="" name="team_id" value="${team.team_id}"></td>
															<td><c:out value="${team.team_id}"></c:out></td>
															<td><c:out value="${team.team_name}"></c:out></td>
															<td><c:out value="${team.city}"></c:out></td>
															<td><c:out value="${team.state}"></c:out></td>
															<td><c:out value="${team.captain}"></c:out></td>
														</tr>
													</tbody>
													</c:forEach>	
												</table>						
									<a class="btn-group btn-group-justified">
										<button type="submit" class="btn btn-primary" name="action" value="add">ADD</button> 
										<button type="submit" class="btn btn-primary" name="action" value="get_team_details">UPDATE</button>
										<button type="submit" class="btn btn-primary" name="action" value="delete">DELETE</button>
									</a>
				
								</form>				
						</div>
					</div>
			</div>
			
	<div class="container">
		
	</div>








</body>

</html>