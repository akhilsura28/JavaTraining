package class_and_object.employee;

public class AccessModifierMain {

	public static void main(String[] args) {

		
		//AccessModifierTemplate emp1 = new AccessModifierTemplate(112233 , "Abraham" , "Lincoln" , 32000);
		
		//System.out.println(emp1);
		
		AccessModifierTemplate emp2 = new AccessModifierTemplate();
		
		emp2.setFirstName("Abraham");
		emp2.setLastName("Lincoln");
		emp2.setSalary(24000);
		emp2.setId(1099);

		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
	}
}
