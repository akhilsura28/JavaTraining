package class_and_object.employee;

public class AccessModifierTemplate {

	private int id ;							//ENCAPSULATION
	
	private String firstName , lastName ;		//ENCAPSULATION
	
	private double salary ;						//ENCAPSULATION
	
	public  String department ;
	
	//////////////////////////////////SETTERS ASSIGN THE VALUE
	
	public void setId (int i){
		id = i ;}
	
	public void setFirstName (String fName){
	   firstName = fName ;}
	
	public void setLastName (String lName){
		lastName = lName ;}
	
	public void setSalary (double sal){
		salary = sal ;}

	
	//////////////////////////////////GETTERS RETURN THE VALUE

	public int getId (){
		return id ;}
	
	public String getFirstName (){
		return firstName ;}
	
	public String getLastName(){
	return lastName;}	
	
	public double getSalary(){
		return salary*12;}

	public String getName(){
		return firstName+lastName;}
	
	//////////////////////////////////CONSTRUCTORS
	
	public void AccessModifierTemplate() {
		
		 
	}
	
	
/*	public  void AccessModifierTemplate( int i , String fName , String lName , double mSalary){
		
		id = i ;
		firstName = fName ;
		lastName = lName ;
		salary = mSalary ;}
		
*/
	////////////////////////////////////////////////
	
			 		
		
}
