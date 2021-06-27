package Loops;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked :");
		
		int num = sc.nextInt();
		
		int dNum = num;
		
		int reverse = 0 ; int digit ;
	
		while(num > 0){
			
			digit = num % 10 ;
			
			reverse = reverse * 10 + digit ;
			
			num = num / 10 ;
						
		}	
		
		if (dNum == reverse)
			System.out.println("The number is a palindrome ");
		else
			System.out.println("The number is not a palindrome");
	}
	
}		
