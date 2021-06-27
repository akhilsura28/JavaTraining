package method_programs;

import java.util.Scanner;

public class OddOrEvenWithBoolean {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		if(isEven(number))
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");

	}
	
	public static boolean isEven(int num) {
		
		if(num % 2 == 0)
		 
		return true ;
		
		else 
			
		return false ;
		
	}
}