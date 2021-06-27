package employee_dao_implementation;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import employee_beans.Employee;
import employee_dao_interfaces.employeeDAO;

public class EmployeeDAO_impl implements employeeDAO {
	
	public static void main(String[] args){
		
		// new EmployeeDAO_impl().getLastEmployeeId();
		
		//Employee emp = new Employee();
		//emp.setEmp_id(1001);
		
		//System.out.println(new EmployeeDAO_impl().getEmployeeById(emp));
		
		/*List<Employee> empList = new EmployeeDAO_impl().retrieveAllEmployees();
		
		for(Employee emp : empList)
			System.out.println(emp);*/
		
		//System.out.println(new EmployeeDAO_impl().deleteEmployeeById(1007));
		
		//Employee emp = new Employee(1003,"amani","",75000,"Junior Resident");
		//new EmployeeDAO_impl().updateEmployee(emp);
		
	}

	@Override
	public void insert(Employee emp) {
		
		Connection con = null;
	
		try{
			
			con = ConnectionFactory.getConnection();
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?);");
			
			ps.setInt(1, emp.getEmp_id());
			ps.setString(2, emp.getEmp_name());
			ps.setString(3, emp.getPassword());
			ps.setInt(4, emp.getSalary());
			ps.setString(5, emp.getDesignation());
			
			int i = ps.executeUpdate();
			
			System.out.println( i + " records inserted !");
			
			con.close();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
				
	}

	
	@Override
	public int getLastEmployeeId() {
		
		Connection con = null;
		int empId = 0 ;
		
		try{
			
			con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select max(emp_id) from employee");
			rs.next();
			empId = rs.getInt(1);
			System.out.println(empId);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return empId;		
	}

	
	@Override
	public Employee getEmployeeById(Employee emp) {	
		try{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from employee where emp_id=?");
		
		ps.setInt(1,emp.getEmp_id());
			
		ResultSet rs = ps.executeQuery();
		
			if(rs.next()){
				
				emp.setEmp_name(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				emp.setDesignation(rs.getString(5));		
			}else{
				return null;
			}
		
		}catch(Exception e){
			
		e.printStackTrace();
			
		}
		return emp;
	}

	@Override
	public List<Employee> retrieveAllEmployees() {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		try{
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from employee;");
			ResultSet rs =ps.executeQuery();
			
			
			while(rs.next()){
				Employee emp = new Employee();
				
				emp.setEmp_id(rs.getInt(1));
				emp.setEmp_name(rs.getString(2));
				emp.setSalary(rs.getInt(4));
				emp.setDesignation(rs.getString(5));
				
				empList.add(emp);
				
			}
			
		}catch (Exception e){
			
			e.printStackTrace();
		}
				
		return empList;
	}

	@Override
	public int deleteEmployeeById(int empId) {
		
		int row = 0;
		
		try{
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from employee where emp_id=?");
			ps.setInt(1,empId);
			
			row = ps.executeUpdate();
			
			//System.out.println(row + "row deleted !");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return row;
	}

	@Override
	public int updateEmployee(Employee emp) {
		
		int row = 0;
		
		try{
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("update employee set emp_name=?,salary=?,designation=? where emp_id=?;");
			ps.setInt(4, emp.getEmp_id());
			ps.setString(1, emp.getEmp_name());
			ps.setInt(2, emp.getSalary());
			ps.setString(3, emp.getDesignation());
			
			row = ps.executeUpdate();
			
			//System.out.println(row + " row updated");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return row ;
	}
	
}
