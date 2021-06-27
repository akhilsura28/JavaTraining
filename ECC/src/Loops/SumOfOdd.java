package Loops;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit :");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0){
			
			if(num % 2 == 1)
			{
				sum += num;
				num--;
			}	
			else
				sum = sum;
				num--;
		}
		System.out.println("The sum of odd numbers is :" + sum);
		
	}

}
