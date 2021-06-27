package array_programs;

import java.util.Scanner;

public class SumOfNumbersOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
	/////////////////////////////////////////////////////////////////	
		
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt();			
		}
		
	/////////////////////////////////////////////////////////////////
		
		int sum = sumOfNumbersOfArray(arr);
		
		System.out.println("The sum of the array elements is :" + sum);
		
	}
	
	
	///////////////////////////METHOD FOR ADDING ELEMENTS///////////////////////////

	public static int sumOfNumbersOfArray(int[] arr){
		
		int sum = 0 , i = 0 ;
		
		for(int num : arr){
			sum = sum + arr[i] ;
			i++ ;
		}
		
		return sum ;
	}
}
