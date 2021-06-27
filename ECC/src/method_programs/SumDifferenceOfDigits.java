package method_programs;

import java.util.Scanner;

public class SumDifferenceOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		System.out.println("The sum of digits is :" + SigmaSum(num));
		
		System.out.println("The difference of digits is :" + SigmaDifference(num));
		
		EvenOddCheck(num);
				
	}

	public static int SigmaSum(int num){
			
		int sum = 0 ;
		
		while (num>0){
			
			int digit = num % 10 ;
			
			sum = sum + digit ;
			
			num = num / 10 ;
		} 
		
		return sum;
	} 
	
	
	public static int SigmaDifference(int num){
		
		int difference = 0 ;
		
		while (num>0){
			
			int digit = num % 10;
			
			difference = digit - difference ;
			
			num = num / 10;
		}
		
		return difference;
	}
	
	public static void EvenOddCheck(int num){
		
		if(num % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		
	}
		
}
