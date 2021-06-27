package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows :");
		
		int row = sc.nextInt();
		
		
		System.out.println("Enter the number of columns :");
		
		int col = sc.nextInt();
		
		System.out.println("---------------------------");
		
		
		System.out.println("Enter " + row*col + " Elements");
		
	
		int[][] arr = inputElements(row,col);
		
		System.out.println("----------------------------");
		
		System.out.println("The Entered "+ row +"*"+ col + " matrix is :" );
		
		displayArrayAsGrid(arr);
		
		
		
		

	}
	
	
	public static int[][] inputElements(int row , int col){
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[row][col];
		
		for(int i = 0 ; i < arr.length ; i++ ){
			
			for(int j = 0 ; j < arr[i].length ; j++){
				
				arr[i][j] = sc.nextInt();}}
		
		return arr;}
	
	
			
	public static void displayArrayAsGrid(int[][] arr){
		
		for(int[] nums: arr){
			
			for(int num : nums){
				
				System.out.print(num + "   ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
