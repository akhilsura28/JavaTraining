<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "employee_beans.Employee"%>
<%@	page import = "java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% List<Employee> empList = (List<Employee>)request.getAttribute("empList");%>
	
	<table>
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Monthly Salary</th>
			<th>Designation</th>			
		</tr>
		
		<% for(Employee emp : empList) { %>
		<tr>
			<td><%= emp.getEmp_id() %></td>
			<td><%= emp.getEmp_name() %></td>
			<td><%= emp.getSalary() %></td>
			<td><%= emp.getDesignation() %></td>
		</tr>
		<% } %>
	
	</table>
	
	
	


</body>
</html>