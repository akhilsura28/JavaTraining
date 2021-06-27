package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num of rows of matrix");
		int row = sc.nextInt();

		System.out.println("Enter the num of columns of matrix");
		int col = sc.nextInt();

		int[][] arr = inputElements(row, col);

		displayArrayasGrid(arr);
		
		System.out.println(Arrays.toString(sumOfEachRow(arr)));
	}

	public static int[][] inputElements(int row, int col) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + arr[i].length + " elements in row " + (i + 1));
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		return arr;
	}

	public static void displayArrayasGrid(int[][] arr) {
		for (int[] nums : arr) {

			for (int num : nums) {
				System.out.print(num + "  ");
			}

			System.out.println();
		}
	}
	
	public static int[] sumOfEachRow(int[][] arr) { 
		int[] result = new int[arr.length];
		
		int sum, i = 0;
		
		for(int[] numbers : arr) {
			sum = 0;
			
			for(int num : numbers) {
				sum += num;
			}
			
			result[i] = sum;
			i++;			
		}
		
		return result;
	}

}