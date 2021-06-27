package array_programs;

import java.util.Scanner;

public class OddEvenOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size] ;
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		
		int evenNumsCount = evenCountInArray(arr);
		
		int[] evenNumArray = evenArray(arr);
					
		System.out.println("The even numbers of the array are : " + evenNumsCount);
		
		for(int i = 0 ; i < evenNumsCount ; i++){
			
			System.out.println(evenNumArray[i]);
			
		}
		
		
		int[] oddNumArray = oddArray(arr);
		
		System.out.println("The odd numbers of the array are : " + (arr.length-evenNumsCount));
		
		for(int i = 0 ; i < (arr.length-evenNumsCount) ; i++){
			
			System.out.println(oddNumArray[i]);
		}
		
	}

	public static int evenCountInArray(int[] arr){
		
		int evenCount = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++){

			if(arr[i] % 2 == 0 ){
			
				evenCount++;}}
		
			return evenCount;}
	
	
	public static int[] evenArray(int[] arr){
		
		int[] newArray = new int[evenCountInArray(arr)];
		
		int i = 0 ; int k = 0 ;
		
		for(int num : arr){
			
			if(arr[i] % 2 == 0 ){
				
				newArray[k] = arr[i];
				k++ ;
			} 
			i++ ;
		}
		
		return newArray ;}
	
	
	public static int[] oddArray(int[] arr){
		
		int[] newArray = new int[arr.length-evenCountInArray(arr)];
		
		int i = 0 ; int k = 0 ;
		
		for(int num : arr){
			
			if(arr[i] % 2 != 0){
				
				newArray[k] = arr[i];
				k++;
			}
			i++ ;
		}
		
		return newArray ;}
	
	
}
	
	
	
	
	
