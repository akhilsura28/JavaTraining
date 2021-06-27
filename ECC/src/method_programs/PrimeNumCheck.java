package method_programs;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked :");
		
		int num = sc.nextInt();
		
		if (checkPrime(num))
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
		

	}
	
	public static boolean checkPrime(int num){
		
		for(int i = 2 ; i <= Math.sqrt(num) ; i++ ){
			
			if(num % i == 0)
				
				return false ;
						
		}
		return true ;
	} 

}
