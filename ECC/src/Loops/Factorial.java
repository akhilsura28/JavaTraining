package Loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int mul = num-1;
		
		while(mul > 1){
		 
			num = num*(mul);
			
			mul--;
		}
		
		System.out.println("The factorial of given number is :" + num);
		
	}

}
