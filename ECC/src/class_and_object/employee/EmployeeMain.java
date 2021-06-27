package class_and_object.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeTemplate e1 = new EmployeeTemplate(112233 , "John" , "Doe" , 20000) ;
		
/*		e1.id = 112233 ;
		
		e1.firstName = "John" ;
		
		e1.lastName = "Doe" ;
		
		e1.department = "Marketing" ;
		
		e1.salary = 20000 ;
*/	
		
		EmployeeTemplate e2 = new EmployeeTemplate(112234 , "Chris" , "Nolan" , 22000) ;
		
/*		e2.id = 112234 ;
		
		e2.firstName = "Chris";
		
		e2.lastName = "Nolan" ;
		
		e2.department = "Finance" ;
		
		e2.salary = 22000 ;
*/		

		EmployeeTemplate e3 = new EmployeeTemplate(112235 , "Di" , "Caprio" , 24000) ;
		
/*		e3.id = 112235 ;
		
		e3.firstName = "Di" ;
		
		e3.lastName = "Caprio" ;
		
		e3.department = "Consulting" ;
		
		e3.salary = 24000 ;
*/		
		
		System.out.println("  ID  " + "  " + "EmployeeName" + "  " + "AnnualSalary" + "  " + "  " + "Department");
		System.out.println(e1.id + "  " + e1.getName() + "  " + e1.getAnnualSalary() + "      " + e1.department);
		System.out.println(e2.id + "  " + e2.getName() + "  " + e2.getAnnualSalary() + "      " + e2.department);
		System.out.println(e3.id + "  " + e3.getName() + "  " + e3.getAnnualSalary() + "      " + e3.department);
 		
	}

}
