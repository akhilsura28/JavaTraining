package Loops;

import java.util.Scanner;

public class FactorialForLoopp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int i ; int factorial = 1;
		
		for (i = 1 ; i <= num ;i++)
		{
			factorial = factorial * i ;
		}
			
			System.out.println("The factorial of " + num + " is " + factorial);
		
	}

}
