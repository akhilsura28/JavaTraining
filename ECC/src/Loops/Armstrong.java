package Loops;

// PROGRAM NOT COMPLETE

import java.util.Scanner;
/*An Armstrong number is a n-digit number that is equal to the sum of n th power of its digits.
 * For ex : 6 = 6^1 =6 ; 371 = 3^3 + 7^3 + 3^3 ;
 */
public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limit :");
		
		int i = sc.nextInt();
		
		int start = 1; int sum = 0; int LastDigit = i;
		
		 int count = 0;
	    	
		 if(start > 0){	
	    		start = start / 10 ;
	    		count ++;
	    	}
		
		while (start <= i){
			
			LastDigit = start % 10;
			
			sum = sum + (int)Math.pow(LastDigit , count);
			
			start++;
			
		}
		System.out.println(sum);
	}
}
