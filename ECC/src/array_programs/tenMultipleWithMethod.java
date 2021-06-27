package array_programs;

import java.util.Scanner;

public class tenMultipleWithMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the numbers of the array :");
		
		for(int i = 0 ; i < arr.length ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int[] arrayOfMultiples = nextMultipleOf10(arr);
		
		for(int num : arrayOfMultiples){
			
			System.out.println(num);
			
		}
				
	}
	
		
	public static int[] nextMultipleOf10(int[] arr){
		
		int[] arrayOfMultiples = new int[arr.length];
				
		int i = 0 ;
				
		for(int num : arr){
			
			if (num%10==0)
				
				arrayOfMultiples[i] = num;
			
			else
				
				arrayOfMultiples[i] = ((num/10) +1)*10;
				
				i++;
			}
		
		return arrayOfMultiples ;
		
	}

}
