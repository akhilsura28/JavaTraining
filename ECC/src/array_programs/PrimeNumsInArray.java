package array_programs;

import java.util.Scanner;

public class PrimeNumsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt() ;
		
		
		
		int[] arr = new int[size] ;
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i< arr.length ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("The number of prime numbers are : " + counter(arr) );
		
		
		int[] primeArray = newArray(arr) ;
		
		for (int i = 0 ; i < counter(arr) ; i++){
			System.out.println(primeArray[i]);
		}

	}

	
	public static boolean primeCheck(int num){
		
		if(num == 0 || num == 1)
			return false ;
		
		for(int i = 2 ; i <= Math.sqrt(num) ; i++ ){
				if(num % i == 0)				
				return false ;}
			
			return true ;}
	
	
	public static int counter(int[] arr){
		
		int count = 0 , i = 0 ;
		
		for(int num : arr)
		{
			if (primeCheck(arr[i]))
			count++ ;
			
			i++ ;}
			
		
		return count ;}
	
	
	public static int[] newArray(int[] arr){
		
		int[] primeArray = new int[counter(arr)];
		
		int i = 0 , k = 0;
		
		for(int num : arr){
			
			if(primeCheck(arr[i])){
				primeArray[k] = arr[i];
						k++;}
			i++;
		}
		
		return primeArray;}
	
}


