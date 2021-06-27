package class_and_object.student;

public class Student {

	int id ;
	
	String name ;
	
	int[] marks;
	
	
	public float percentage() {
		
		int sum = 0 ;
		
		for(int i = 0 ; i < marks.length ; i++){
			
			sum += marks[i];}
		
		return (float)sum / marks.length ;
	}

}
