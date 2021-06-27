package Loops;

import java.util.Scanner;

public class CubeTheDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		
		int Num = sc.nextInt();
		
		int N = Num;
		
		int lastDigit = 0;
		
		int sum = 0;
		
		while(Num > 0){
			
			lastDigit = Num % 10 ;
			
			sum = sum + (int)Math.pow(lastDigit, 3);
			
			Num = Num/10;
		}
		
		if (sum == N)
			
			System.out.println("The Number is also Armstrog");
		
		else 
			System.out.println("The Number is not Armstrog");
		
		System.out.println("The Sum is : "+ sum );
	}

}
