package employee_services;

import java.util.List;

import employee_beans.Employee;
import employee_dao_implementation.EmployeeDAO_impl;
import employee_dao_interfaces.employeeDAO;

public class EmployeeService {
	
	public static void main(String args[]){
		System.out.println(new EmployeeService().authenticateEmployee(1001,"qerty098"));
	}
	
	public void deleteEmployee(int empId){
		
		employeeDAO empDAO = new EmployeeDAO_impl();
		int i = empDAO.deleteEmployeeById(empId);
		
	}
	
	public int registerEmployee(Employee emp){
		
		employeeDAO empDAO = new EmployeeDAO_impl();
		
		int empId = empDAO.getLastEmployeeId(); 
		
		
		if(empId == 0)
			empId = 1000;
		
		emp.setEmp_id(++empId);
		
		new EmployeeDAO_impl().insert(emp);
		
		return empId; 
	}
	
	
	
	
	public Employee authenticateEmployee(int empId , String password){
		
		Employee emp = new Employee();
		emp.setEmp_id(empId);
		
		emp= new EmployeeDAO_impl().getEmployeeById(emp);
		
		if(emp == null){
			return null;
		}else{
			if(emp.getPassword().equals(password)){
				return emp;
			}else{
				emp.setPassword("Wrong");
				return emp;
			}
		}
	}

	
	public List<Employee> retrieveAllEmployees(){
		
		return new EmployeeDAO_impl().retrieveAllEmployees();
	}
	
	public Employee getEmployeeById(Employee emp){
		
		return new EmployeeDAO_impl().getEmployeeById(emp);		
	}
	
	public static int updateEmployee(Employee emp){
		return new EmployeeDAO_impl().updateEmployee(emp);
	}
	
	
}
