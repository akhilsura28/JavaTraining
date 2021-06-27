package array_programs;

/*Create an integer array which stores 5 integers. 
 *Program then checks each integer, if the integer is a multiple of 10, 
 *it prints the same integer, else it prints the next multiple of 10 */

import java.util.Scanner;

public class tenMultiple {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array elements :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt() ;
		}
		
		System.out.println("The numbers are :");
		
		for(int i = 0 ; i < arr.length ; i++ ){
		
			System.out.println(arr[i]);
		} 
		
		System.out.println("The required set of numbers are :");
		
		/*	for(int i = 0 ; i < arr.length ; i++){
			
			if (arr[i] % 10 == 0)
				System.out.println(arr[i]);
			else	{
				
				System.out.println((arr[i]/10 + 1)*10);
		}	*/
			
			
		for(int num : arr){
			
			if (num % 10 == 0)
				System.out.println(num);
			else		
				System.out.println((num/10 + 1)*10);
					
		}
		
	}

}

