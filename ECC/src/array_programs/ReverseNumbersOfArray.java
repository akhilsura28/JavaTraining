package array_programs;

import java.util.Scanner;

public class ReverseNumbersOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
	/////////////////////////////////////////////////////////////////////	
		
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = sc.nextInt() ;
			
		}
		
	/////////////////////////////////////////////////////////////////////	
		
		int[] newArray = reverseNumbersOfArray(arr);
		
		System.out.println("The reverse of numbers of the array are :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			System.out.println(newArray[i]);
		}

	}

	////////////////////////METHOD 1 REVERSE THE  EACH NUMBER//////////////
	
	
	public static int reverse(int num){
		
		int digit , rev = 0 ; 
		
		while (num > 0){
			
			digit = num % 10 ;
			
			rev = rev*10 + digit ;
			
			num = num / 10 ;
		}
		
		return rev ;
	}
	
	
	///////////////////////METHOD 2 FETCH THE NUMBERS FROM INPUT ARRAY //////////////////
	
	
	public static int[] reverseNumbersOfArray(int[] arr){
		
		int[] reverseArray = new int[arr.length];
		
		int i = 0 ;
				
		for(int num : arr)
		{
			reverseArray[i] = reverse(num);
		 
			i++;
		}
		
		return reverseArray ;
		
	}
}
