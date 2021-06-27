package array_programs;

import java.util.Scanner;

public class arrayBirthFromNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be converted to array :");
		
		long num = sc.nextLong();
		
		
		int[] newArray = array(num);
		
		System.out.println("The numbers of the array are :");
		
		for(int i = 0 ; i < sizeOfArray(num) ; i++){
			
			System.out.println(newArray[i]);
		}
		
		

	}

	
	public static int sizeOfArray(long num){
		
		int count = 0 ;
		
		while(num > 0 ){
			
			num = num/10 ;
			
			count++ ;
		}
		
		return count ;
	}
	
	
	public static int[] array(long num){
		
		int[] newArray = new int[sizeOfArray(num)];
		
		int i = 0;
		
		for(i = 0 ; i < newArray.length ; i++){
			
			newArray[i] = (int) (num % 10) ;
			
			num = num / 10 ;
		}
		
		return newArray ;} 
}
