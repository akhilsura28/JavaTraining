package Loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limit :");
		
		int num = sc.nextInt();
		
		int t1 = 0 ; int t2 = 1 ; int t3 = 0;
		
		System.out.println(t1);
		
		System.out.println(t2);	
		
		for (int i = 2 ; i < num ; i++){
			
			t3 = t1 + t2 ;
			
			System.out.println(t3);
			
			t1 = t2 ;
			
			t2 = t3 ;
			
		}
			
	}

}
