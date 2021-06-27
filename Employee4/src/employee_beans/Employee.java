package employee_beans;

import java.io.Serializable;

public class Employee implements Serializable {

	private int emp_id;
	private String emp_name;
	private String password;
	private int salary;
	private String designation;
	
	public Employee() {
		super();
		
	}
	
	public static int idGen = 1000;
	
	public Employee(String emp_name, String password, int salary, String designation) {
		this.emp_name = emp_name;
		this.password = password;
		this.salary = salary;
		this.designation = designation;
	}



	public Employee(int emp_id, String emp_name, String password, int salary, String designation) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.password = password;
		this.salary = salary;
		this.designation = designation;
	}

	

	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", password=" + password + ", salary=" + salary
				+ ", designation=" + designation + "]";
	}
	
	
	
	
}
