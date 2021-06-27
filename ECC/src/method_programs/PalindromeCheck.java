package method_programs;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked :");
		
		int num = sc.nextInt();
		
		if (checkPalindrome(num))
		System.out.println("The given number is palindrome ");
		else
		System.out.println("Not a palindrome");

	}

	public static boolean checkPalindrome(int num){
		
			int digit , reverse = 0 , dNum = num ;
			
			while(num>0){
				digit = num % 10 ;
				reverse = reverse*10 + digit ;
				num = num /10;			
			}
			
			if (dNum == reverse)
				return true ;
			else
				return false ;
			
	}
}
