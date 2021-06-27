package Loops;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int bit = num;
		
		int sum = 0;
		
		while(num > 0){
			
			if(num % 2 == 0)
			{
				sum += num;
				num--;
			}	
			else
				sum = sum;
				num--;
		}
		System.out.println("The sum of " + bit + " odd numbers is :" + sum);

	}

}
