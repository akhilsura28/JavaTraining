package Loops;

import java.util.Scanner;

//PERFECT NUMBERS ARE 6 , 28 , 496 , 8128 //

public class PerfectNumberCheck {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		int i = 1;
		
		int sum = 0;
		
		while(num > i)
		{
			if(num % i == 0){
				
				sum = sum + i;//sum += i;
				
				i++;
			}
			else				
			    
				i++;
		}
		
		if (num == sum)
			System.out.println("The number is perfect ");
			
		else
			System.out.println("The number is not perfect ");		
		}
	}

	