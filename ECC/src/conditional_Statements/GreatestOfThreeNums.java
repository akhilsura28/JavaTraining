package conditional_Statements;

import java.util.*;

public class GreatestOfThreeNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Three Numbers :");
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		int num3 = sc.nextInt();
		
		if (num1 > num2){
			
			if(num1 > num3)
				System.out.println(num1 + " - is the greatest among the given numbers !");
			else
				System.out.println(num3 + " - is the greatest among the given numbers !");
		}
		else if(num2 > num3){
			 
			 	System.out.println(num2 + " - is the greatest among the given numbers !");
		}
		else 
	 			System.out.println(num3 + " - is the greatest among the given numbers !");
			 	
		}
}



