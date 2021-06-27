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
<body>

		<h2>UPDATE EMPLOYEE DETAILS :</h2>

	<form action="EmployeeServlet">
		<div class="input-group">
			<div class="input-group-prepend">
					<div><span class="input-group-text">Employee Id :</span> <input type="text" name="empId" value="${emp.emp_id}" readonly></div><br>
					<span class="input-group-text">Name :</span> <input type="text" name="empName" value="${emp.emp_name}"><br>
					<span class="input-group-text">Salary :</span> <input type="text" name="salary" value="${emp.salary}"><br>
					<span class="input-group-text">Designation :</span> <input type="text" name="designation" value="${emp.designation}"><br>
			</div>
			<input type ="submit" name="action" value="UPDATE">
		</div>
	</form>	
</body>
</html>