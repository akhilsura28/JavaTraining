package Loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num>0){
			
			sum += num;
			
			num--;
						
		}
		
		System.out.println("The sum is :" +sum);
		
	}

}
