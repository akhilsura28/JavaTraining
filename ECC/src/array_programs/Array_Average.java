package array_programs;

import java.util.Scanner;

public class Array_Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt() ;
		
			
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the array :");
		
		
		for (int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt();
		}
		
				
		System.out.println("The average of the numbers is :" + averageArray(arr));
		

	}
	
///////////////////////////////////////////////////////////////////////////////////	
	
	public static double averageArray(int[] arr){
			
		double average = sum(arr) / (double)arr.length ;
		
		return average ;
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int sum(int[] arr){
			
		int sum = 0 , i = 0 ;
		
		for(int num : arr){
			
		sum	= sum + arr[i] ;
		
		i++ ;
			
		}		
		return sum ;	
	}
}

