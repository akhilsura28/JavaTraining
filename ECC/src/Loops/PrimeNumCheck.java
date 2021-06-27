package Loops;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int i = 1;
		
		int count = 0;
		
		while(num >=  i){
			
			if(num % i == 0)
			{
			count ++ ;
			i++ ;
			}
			else
				i++ ;	
	}
		
		while(i <= Math.sqrt(num)){
			
			
		}
		
		if(count == 2){
			System.out.println(num + " is a prime number ");
		}
		else
			System.out.println(num + " is not a prime number ");
	}
}
