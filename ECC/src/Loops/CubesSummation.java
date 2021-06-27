package Loops;

import java.util.Scanner;

public class CubesSummation {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number :");
		
		int start = sc.nextInt();
		
		System.out.println("Enter the ending number :");
		
		int End = sc.nextInt();
		
		double sum = 0;
		
		while (start <= End){
						
			sum = sum +(Math.pow(start,3));
			
			start++;
		
		}
		System.out.println("The sum of cubes of the digits of given number is : "+ sum );
	}

}
