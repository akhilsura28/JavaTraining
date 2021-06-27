package employee_dao_interfaces;

import java.util.List;

import employee_beans.Employee;

public interface employeeDAO {
	
	public void insert (Employee emp);

	public int getLastEmployeeId();
	
	public Employee getEmployeeById(Employee emp);
	
	public List<Employee> retrieveAllEmployees();
	
	public int deleteEmployeeById(int empId);
	
	public int updateEmployee(Employee emp);
	
	
}
