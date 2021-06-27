package method_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		System.out.println("The factorial is :" + factorial(num));
		
	}

	
	public static long factorial(int num){
		
		int factorial = 1 ;
		
		for(int i = 1 ; i <= num ; i++ ){
		
			factorial = factorial * i;
		}
		return factorial;
	}
}
