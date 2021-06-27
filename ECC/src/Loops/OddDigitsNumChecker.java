package Loops;

import java.util.Scanner;

public class OddDigitsNumChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be Checked :");
		
		long num = sc.nextLong();
		
		while(num > 0)
		{
			if(num % 2 == 0 )
			{
				System.out.println("All the digits in the number are not odd :");
				break;
			}	
			
			else 
			
				num = num / 10;
					
		}
		
		if (num == 0)
		{
		System.out.println("All the digits in the number are odd :");
		}
	}
}
