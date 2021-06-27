package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf3By3Matices {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows :");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns :");
		int col = sc.nextInt();
		
		int[][] arr1 = new int[row][col] ;
		
		int[][] arr2 = new int[row][col] ;
		
		System.out.println("Enter the "+ row*col +" numbers of the first matrix :");
		
			for(int i = 0 ; i < arr1.length ; i++){
			
				System.out.println("enter row numbers of " + (i+1));
					for(int j = 0 ; j < arr1[i].length ; j++){
				
							arr1 [i][j] = sc.nextInt();}}
			
				
		System.out.println("Enter the "+ row*col +" numbers of the second matrix :");
			
			for(int i = 0 ; i < arr2.length ; i++){
				
				System.out.println("enter row numbers of "+ (i+1));
					for(int j = 0 ; j < arr2[i].length ; j++){
			
							arr2 [i][j] = sc.nextInt();}}
			
			
			
		System.out.println("The result of adding matrix 1 ");
		
		TwoDimArrayDemo.displayArrayAsGrid(arr1);
		
		
		System.out.println("with matrix 2 is ");
		
		TwoDimArrayDemo.displayArrayAsGrid(arr2);
		
			
		System.out.println("is equal to below matrix :");
		
		int[][] result = sumOfMatrix(arr1,arr2);
		
		TwoDimArrayDemo.displayArrayAsGrid(result);
		
			
		
/*			
			for(int i = 0 ; i < row ; i++){
				
				for(int j = 0 ; j < col ; j++){
					
					System.out.print(result[i][j] + "  ");} 
				
				System.out.println();}
*/			
			
		}
	
				
	public static int[][] sumOfMatrix(int[][] arr1 ,int[][] arr2){
		
		
		int[][] result = new int[arr1.length][arr1[0].length]; 
		
		int k = 0 ;
		
		for(int i = 0 ; i < arr1.length ; i++){
			
				for(int j = 0 ; j < arr1[i].length ; j++){
				
				result[i][j] = arr1[i][j] + arr2[i][j] ;
			}
		}
		
		return result ;
		
	}
}
