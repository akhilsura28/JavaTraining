package Loops;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,i;
		
		System.out.println("Enter any number");
		
		num=sc.nextInt();
		
		int sum = 0 ;
		
		for(i = 1 ; i < Math.sqrt(num) ; i++){
		
			if(num % i == 0 && num/i != i)
				
				sum += i + (num/i) ;
				
		}
		
		if(i*i == num) 
			
			sum += i;
		
		System.out.println("sum of factors :" + sum);
	}

}

