package basic_programs;

import java.util.Scanner;

public class CountFactors {

	//BECAUSE 1 AND NUM ITSELF ARE FACTORS TAKE COUNT = 2 AND REDUCE ITERATIONS
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int count = 2 ; int i = 2 ;
		
		while(i <= num/2 ){
			
			if (num % i == 0){
				
				count++ ;
				
				i++ ;
			}
			else
				i++ ;		
		}
		
		if(count == 2)
			System.out.println("The number is prime ");
		else
			System.out.println("The number is not prime");
		
		System.out.println("The number of factors are :" + count);

	}

}
