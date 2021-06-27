package method_programs;

import java.util.Scanner;

public class OddDigitsCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be Checked :");
		
		int num = sc.nextInt();
		
		if(checkOddDigits(num))
			System.out.println("All digits are odd");
		else
			System.out.println("All digits are not odd");
		
	}
	
		
	public static boolean checkOddDigits(int num){
		
		int digit , evencount = 0 , oddcount = 0 , digitcount = 0 ;  
		
		while(num > 0){
			
			digit = num % 10 ;
			
			if(digit % 2 == 0)
				evencount++ ;
			else
				oddcount++ ;
			
			digitcount++ ;
			num = num / 10 ;
			
		}
		
		if (oddcount == digitcount)
			return true ;
		else 
			return false ;
			
		}
	}


