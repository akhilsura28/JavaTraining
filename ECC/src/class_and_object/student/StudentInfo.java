package class_and_object.student;

public class StudentInfo {

	public static void main(String[] args) {
		
		Student s1 = new Student() ;
		
		int marks[] = {45, 34, 48 , 12 , 67};
		
		s1.id = 101 ;
		
		s1.name = "John" ;
		
		s1.marks = marks ;
		
		System.out.println(s1.id + " " + s1.name + "   " + s1.percentage() );
		
		
		Student s2 = new Student() ;
		
		int marks2[] = {23, 34, 56, 67};
		
		s2.id = 102 ;
		
		s2.name = "Adam" ;
		
		s2.marks = marks2 ;
		
		
		Student s3 = new Student() ;
		
		int marks3[] = {32 , 34, 56};
		
		s3.id = 103 ;
		
		s3.name = "David" ;
		
		s3.marks = marks3 ;
		
		System.out.println(s2.id + " " + s2.name + "   " + s2.percentage() );
		
		System.out.println(s3.id + " " + s3.name + "   " + s3.percentage() );
		
	}
}
