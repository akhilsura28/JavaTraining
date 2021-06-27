package conditional_Statements;

import java.util.*;

public class studentGrades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char Grade = 0;
		
		System.out.println("Enter the marks in Math :");
		
		int math = sc.nextInt();
		
		System.out.println("Enter the marks in Physics :");
		
		int phy = sc.nextInt();
		
		System.out.println("Enter the marks in Chemistry :");
		
		int che = sc.nextInt();
		
		double totalPercentage = ((math + phy + che)/300.0)*100 ;
		
		/* if (totalPercentage >= 90 )									
			
			System.out.println("Grade A");
			
		else if(totalPercentage >=70 && totalPercentage <90 )
			
			System.out.println("Grade B");
		
		else if(totalPercentage >= 50 && totalPercentage <70 )
			
			System.out.println("Grade C");
		
		else if(totalPercentage < 50)
			
			System.out.println("Grade F"); */
		
		System.out.println("The percentage is : " + totalPercentage);
		
		if (totalPercentage >= 90)									
			
			 Grade = 'A';
			
		else if(totalPercentage >=70)
			
			Grade = 'B';
		
		else if(totalPercentage >= 50)
			
			Grade = 'C';
		
		else if(totalPercentage < 50)
			
			Grade = 'F';
		
		System.out.println("The Grade is :" + Grade);
		
	}

}
