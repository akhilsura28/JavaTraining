package class_and_object.employee;

public class EmployeeTemplate {

	//FEATURES
	
	int id ;
	
	String firstName ;
	
	String lastName ;
	
	String department ;
	
	double salary ;
	
	//CONSTRUCTOR
	
	public EmployeeTemplate(int i , String fName , String lName , double mSalary){
		
		id = i ;
		firstName = fName ;
		lastName = lName ;
		salary = mSalary ;
		
	}
	
/////////////////////////////////////////////////////
	
	public String getName(){
		
		return (firstName + lastName + "    ");
		
	}
	
	
	public double getAnnualSalary(){
		
		return (salary)*12;
	}
	

}
