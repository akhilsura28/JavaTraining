package method_programs;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks in Math :");
		
		int math = sc.nextInt();
		
		System.out.println("Enter the marks in Physics :");
		
		int phy = sc.nextInt();
		
		System.out.println("Enter the marks in Chemistry :");
		
		int che = sc.nextInt();
		
		double totalPercent = percentage(math,phy,che);
		
		
		System.out.println("The Percentage is : " + totalPercent );
		
		System.out.println("The Percentage is : " + percentage(math,phy,che));
		
		System.out.println("The Grade is : " + findGrade(totalPercent));
		
		System.out.println("The Grade is : " + findGrade(percentage(math,phy,che)));
		
	}

	
	public static double percentage(int math ,int phy , int che){
		
		return ((math + phy + che)/300.0)*100 ;
	}
	
	
	public static char findGrade(double Percentage){
		
		char grade = 0;
		
		if (Percentage >= 90)									
			
			 grade = 'A';
			
		else if(Percentage >=70)
			
			grade = 'B';
		
		else if(Percentage >= 50)
			
			grade = 'C';
		
		else if(Percentage < 50)
		
			grade = 'F';
		
		return grade ;
	}
}
