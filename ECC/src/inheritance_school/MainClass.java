package inheritance_school;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student ("Akhil S", "Karimnagar", "IIT" , 9 , 35000);
		System.out.println(s1);
		
		
		Staff e1 = new Staff ("HC Verma" , "Hyderabad" , "NIT Calicut" , 50000);
		System.out.println(e1);						
		System.out.println(e1.getSchool()); 		//this is possible because of setters and getters//
		e1.setSchool("IIT Dharwad");
		System.out.println(e1);
		
		
		Staff e2 = new Staff();
		e2.setAddress("Chandigarh");
		System.out.println(e2.getAddress());
		
		
		Person p1 = new Person ();
		p1.setName("Srinivasa Ramanujan");
		System.out.println(p1.getName());
		
		
	}

}
