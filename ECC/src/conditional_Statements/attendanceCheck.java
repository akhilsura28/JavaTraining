package conditional_Statements;

import java.util.*;

public class attendanceCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of classes held : ");
		
		int classesHeld = sc.nextInt();
		
		System.out.println("Enter the number of classes attended : ");
		
		int classesAttended = sc.nextInt();
		
		double percentClassesAttended = (classesAttended / (double)classesHeld)*100 ;
		
		if(percentClassesAttended >= 75 && percentClassesAttended <=100){
		
			System.out.println("The attendance is :" + percentClassesAttended);
			
			System.out.println("The candidate is eligible to attend the exams");
		}
		else if (percentClassesAttended < 75){
		
			System.out.println("The attendance is :" + percentClassesAttended);
		
		    System.out.println("The candidate is not eligible to attend the exams");
		}
		else if(percentClassesAttended > 100) {
			
			System.out.println("You gotta be kiddin");
				
		}
			
	}

}
