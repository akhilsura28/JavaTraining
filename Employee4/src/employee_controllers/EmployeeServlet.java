package employee_controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import employee_beans.Employee;
import employee_services.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("login")){
		
			loginEmployee(request,response);
		}
		
		
		if(action.equalsIgnoreCase("register")){
		
			registerEmployee(request,response);	
		}
		
		
		if(action.equalsIgnoreCase("view_all_employees")){
			
			viewAllEmployees(request,response);
		}
		
		if(action.equalsIgnoreCase("delete")){
			
			deleteEmployee(request,response);
		}
		
		if(action.equalsIgnoreCase("get_emp_details")){
			
			getEmployeeDetails(request,response);
		}
		
		if(action.equalsIgnoreCase("update")){
			
			updateEmployee(request,response);			
		}
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	public static void viewAllEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//EmployeeService emp = new EmployeeService();
		//emp.retrieveAllEmployees();
		
		List<Employee> empList = new EmployeeService().retrieveAllEmployees();
		
		request.setAttribute("empList", empList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ViewAllEmployeesJSTL.jsp");
		rd.forward(request, response);
	}
	
	
	public static void registerEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String empName = request.getParameter("empName");//from register.html page//
		String password = request.getParameter("pass");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String designation = request.getParameter("designation");
		
		Employee emp = new Employee(empName,password,salary,designation);
		
		int empId = new EmployeeService().registerEmployee(emp);
		
		request.setAttribute("empId", empId);
		
		RequestDispatcher rd = request.getRequestDispatcher("/RegSuccess.jsp");
		rd.forward(request, response);
	}
	
	public static void loginEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		String password = request.getParameter("pass");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		Employee emp = new EmployeeService().authenticateEmployee(empId, password);
		
		RequestDispatcher rd = null;
		
		if(emp == null){
			
			out.write("Cannot find employee id . Please register first!");
			
			rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
			
		}else if(emp.getPassword().equalsIgnoreCase("wrong")){
			
			out.write("Wrong Password !");	
			rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
			
		}else{
			
			session.setAttribute("emp",emp);
			rd = request.getRequestDispatcher("EmpDetails.jsp");
			rd.forward(request, response);
		}
		
	}
	
	public static void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		new EmployeeService().deleteEmployee(empId);
		viewAllEmployees(request,response);
		
	}
	
	public static void getEmployeeDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//System.out.println("In get employee details");
		int empId = Integer.parseInt(request.getParameter("empId"));
		Employee emp = new Employee();
		emp.setEmp_id(empId);
		
		emp = new EmployeeService().getEmployeeById(emp);
		
		request.setAttribute("emp", emp);
		
		RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
		rd.forward(request, response);
		
	}
	
	public static void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		String empName= request.getParameter("empName");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String designation = request.getParameter("designation");
		
		Employee emp = new Employee();
		
		emp.setEmp_id(empId);
		emp.setEmp_name(empName);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		
		new EmployeeService().updateEmployee(emp);
		
		viewAllEmployees(request,response);
	}
}
