<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="employee_beans.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

		<% Employee emp = (Employee)session.getAttribute("emp");%>
		
		<p>Welcome <%=emp.getEmp_name() %></p>
		
		<h3> Employee Details </h3>
		
		<div>
		<p>Salary : <%= emp.getSalary() %></p>
		<p>Designation : <%= emp.getDesignation() %></p><br><br>	
		</div>
	

</body>
</html>