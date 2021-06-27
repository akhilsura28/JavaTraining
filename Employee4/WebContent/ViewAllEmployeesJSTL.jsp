<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "employee_beans.Employee"%>
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
<body>
		<div class="container">
		<%-- <% List<Employee> empList = (List<Employee>)request.getAttribute("empList");%> --%>
	
				<form action="EmployeeServlet" >
						<table class="table table-hover">
							<thead>
									<tr>
										<th>Select</th>
										<th>Employee ID</th>
										<th>Employee Name</th>
										<th>Monthly Salary</th>
										<th>Designation</th>			
									</tr>
							</thead>
									<%-- <% for(Employee emp : empList) { %>
									<tr>
										<td><%= emp.getEmp_id() %></td>
										<td><%= emp.getEmp_name() %></td>
										<td><%= emp.getSalary() %></td>
										<td><%= emp.getDesignation() %></td>
									</tr>
									<% } %> --%>
									
									
							
									<c:forEach items="${empList}" var="emp">
									<tbody>
										<tr>
											<td><input type="radio" id="" name="empId" value="${emp.emp_id}"></td>
											<td><c:out value="${emp.emp_id}"></c:out></td>
											<td><c:out value="${emp.emp_name}"></c:out></td>
											<td><c:out value="${emp.salary}"></c:out></td>
											<td><c:out value="${emp.designation}"></c:out></td>
										</tr>
									</tbody>
									</c:forEach>	
								</table>
						<br><br>			
				
						<button type="submit" formaction="EmployeeServlet" name="action" value="delete">DELETE</button>
						<button type="submit" formaction="EmployeeServlet" name="action" value="get_emp_details">UPDATE</button>
						
				</form>		
		</div>
		
</body>
</html>