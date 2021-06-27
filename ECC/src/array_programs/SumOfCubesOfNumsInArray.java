package array_programs;

import java.util.Scanner;

public class SumOfCubesOfNumsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
		
		
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("The sum of the cubes of the numbers of the array is :" + '\n' + sumOfCubedNums(arr));
		
	}

	
	public static int[] cubeTheNums(int[] arr){
		
		int[] cubeArray = new int[arr.length];
		
		int i = 0 , k = 0 ;
		
		
		for(int num : arr){
			
			cubeArray[k] = (int) Math.pow(arr[i], 3);
			
			k++ ;
			i++ ;
		}
		
		return cubeArray ;}
	
	
	public static long sumOfCubedNums(int[] arr){
		
		long sum = 0 ;
		
		int[] cubes = cubeTheNums(arr);
		
		for(int i = 0 ; i < arr.length ; i++){
			
			sum = sum + cubes[i] ;
		}
		
		return sum ;
	}
	
}
