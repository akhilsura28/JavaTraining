package method_programs;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers :");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int k = add(num1,num2);
		
		
		long m = mul(num1,num2);
		
		
		double n = divide(num1,num2);
		
		
		System.out.println("sum is 		  :" + k);
		

		System.out.println("Difference is :" + subtract(num1,num2));
		
		
		System.out.println("Product is 	  :" + m);
		
		
		System.out.println("Division is   :" + n);
		
		
		System.out.println("Average is    :" + average(num1,num2 ));
	}
	
	
	public static int add(int num1 , int num2){
		
		int sum = num1 + num2 ;
		
		return sum ;
		
	}
	
	
	public static int subtract(int num1 , int num2){
		
		int sub;
		
		if (num1 > num2)
		sub = num1 - num2;
		else
		sub = num2- num1;
		
		return sub;
		
	}
	
	
	public static double divide(int num1 , int num2){
		
		double divide;
		
		if(num1 > num2)
			divide = (double)num1/num2 ;
		else
			divide = (double)num2/num1 ;
		
		return divide ;
	}
	
	
	public static long mul(int num1 , int num2){
		
		long mul = num1 * num2 ;
		
		return mul ;
	}
	
	
	public static double average(int num1 , int num2){
		
		int s = add(num1,num2);
		
		double avg = s/2.0;
		
		return avg;
	}
}
