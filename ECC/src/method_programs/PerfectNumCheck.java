package method_programs;

//PERFECT NUMBERS ARE 6 , 28 , 496 , 8128 //

import java.util.Scanner;

public class PerfectNumCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked :");
		
		int num = sc.nextInt() ;
		
		if(isPerfect(num))
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");

	
		System.out.println(perfectNumCheck(num));
	}
	
	
	
	public static boolean isPerfect(int num){
		
		return num == perfectNumCheck(num) ;
	}
	
	
	public static int perfectNumCheck(int num){
		
		int sum = 1 ; 
		
		for(int i = 2 ; i <= Math.sqrt(num) ; i++ ){
			
			if (num % i == 0 && num/i == i)
				
				sum = sum + i ;
			
			if(num % i == 0 && num/i != i)
				
				sum = sum + i + (num/i);
					
		} 
		return sum ;
		
	} 

}
