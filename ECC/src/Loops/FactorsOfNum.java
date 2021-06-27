package Loops;

import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int i = 1;
		
		int count = 0;
		
		while (i <= Math.sqrt(num) ){
			
			 if(num % i == 0 && num/i == i){
				 			 
				 System.out.println(i);
				 
				 count += 1 ;
				 
			 }	
			 
			 if(num % i == 0 && num/i != i){
				 
				 System.out.println(i + "  "+ num/i);
				 
				 count += 2 ;
				
			 }
			 
			 i++;
		}	
		
		System.out.println("The number of factors are :" + count );
	}	
}
