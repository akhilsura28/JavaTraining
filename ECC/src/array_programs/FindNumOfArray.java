package array_programs;

import java.util.Scanner;

public class FindNumOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
//////////////////////////////////////////////////////////////////
		
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt() ;
		}
		
////////////////////////////////////////////////////////////////////////		
		
		System.out.println("Enter the number to be searched : ");
		
		int search = sc.nextInt();
		
		
		if(findArrayNumber(search , arr))
			
			System.out.println("Num found ");
		else
			System.out.println("Num not found ");
		
	}
	
//////////////////////////////////////////////////////////////////////
	
	public static boolean findArrayNumber(int search , int[] arr){
		
		int i = 0 ; 
		
		for(i = 0 ; i < arr.length ; i++){
			
			if (arr[i] == search)
				
				return true ;
			
		}
		
		return false ;
				
	}

}
