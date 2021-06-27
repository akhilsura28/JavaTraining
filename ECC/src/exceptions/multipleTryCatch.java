package exceptions;

import java.util.Scanner;

public class multipleTryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int arr[] = null ; 
		
		
		try{
	
		arr	= new int[size];
		
		}catch(NegativeArraySizeException a){
			
			System.out.println(a.getMessage() + " Give proper size of Array :");
			size = sc.nextInt();
			arr	= new int[size];
		}
		
		
		try{
		for(int i = 0 ; i <= size ; i++){
			
			arr[i] = sc.nextInt();
		}
		}catch(ArrayIndexOutOfBoundsException a){
			
			a.printStackTrace();				// IT WILL GIVE DETAILED INFORMATION ABOUT THE EXCEPTION
		}
		
		
		System.out.println("values in the array............");
		
		for(int value : arr){
			System.out.println(value);
		}
		
	}
	
	///////////////////////ANOTHER WAY OF WRITING////////////////////////////////////////////
	
	public static void nestedTry(){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = null;
		
		int size = sc.nextInt();
		
		try{
			
			arr = new int[size];
			
			try{
			for(int i = 0 ; i <= size ; i++){
				arr[i] = sc.nextInt();
			}
			}catch(ArrayIndexOutOfBoundsException a){
				
				a.printStackTrace();
			}
			
		}catch(NegativeArraySizeException k){
			
			k.printStackTrace();
		}
	}

	
}
