package array_programs;

import java.util.Scanner;

public class LargestNumOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
//////////////////////////////////////////////////////////////////////		

		
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt() ;
		}	
		
///////////////////////////////////////////////////////////////////////		
		
		int max = findLargestNum(arr);
			
		System.out.println("The largest number is : " + max);
				
		}
		
/////////////////////////////////////////////////////////////////////////
	
		
		public static int findLargestNum(int[] arr){
			
			int i = 0; int max = 0 ;
			
			for(int num : arr){
					
				if(arr[i] > max)	
					max = arr[i] ;
					
					i++ ;
			}	
				
			return max ;
				
		}
			
}




