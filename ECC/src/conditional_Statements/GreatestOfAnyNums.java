package conditional_Statements;

import java.util.Scanner;

public class GreatestOfAnyNums {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numbers :");
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		int num3 = sc.nextInt();
		
		int num4 = sc.nextInt();
		
		
		int max = num1;
		
		if (max < num2)
			max = num2;
		
		if (max < num3)
			max = num3;
		
		if (max < num4)
			max = num4;
		
		System.out.println("The greatest number is : "+ max);
		
	}

}
