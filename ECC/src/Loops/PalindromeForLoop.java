package Loops;

import java.util.Scanner;

public class PalindromeForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be Checked :");
		
		int num = sc.nextInt() ;
		
		int dNum , reverse = 0 , digit ;
		
		for(dNum = num ; num > 0 ; num = num/10){
			
				digit = num % 10 ;
			
				reverse = reverse*10 + digit ;
					
		}
		
		System.out.println(dNum);
		System.out.println(reverse);
		System.out.println(num);
		
		if (dNum == reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
