package array_programs;

//MAIN ARRAY IS BASICALLY THE NUMBER OF ROWS //

//BABY ARRAY IS BASICALLY THE NUMBER OF COLUMNS//

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfNumIn3By3Rows {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of main array :");
		
		int mainarray = sc.nextInt();
		
		System.out.println("Enter the length of baby arrays :");
		
		int babyarray = sc.nextInt();
		
		int[][] arr = new int[mainarray][babyarray];
		
		
		for(int i = 0 ; i < arr.length ; i++){
			
			System.out.println("Enter the numbers of the "+ (i+1) + " baby array");
			
			for(int j = 0 ; j < arr[i].length ; j++){
				
				arr [i][j] = sc.nextInt();}}

		
		System.out.println("The max nums of the baby arrays are :" + Arrays.toString(maxOfRows(arr)));
		
		
	}
	
	
	public static int[] maxOfRows(int[][]arr){
		
		int[] result = new int[arr.length] ;
		
		int max , i = 0 ;
		
		for(int[] nums : arr){
			
			max = nums[0] ;
			
			for(int num : nums){
				
				if(num > max)
					max = num;
			}
			
			result[i] = max ;
			i++;
			
		}
		
		return result ;} 
		
}
