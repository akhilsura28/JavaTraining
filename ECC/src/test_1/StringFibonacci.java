package test_1;

import java.util.*;

public class StringFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the word :");

		String text = sc.next().toUpperCase();

		char[] alphabets = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {

			alphabets[i] = text.charAt(i);
		}

		
		int[] fibonacciArray = fibonacciArrayOfAlphabets();
		
		char[] alphabetsArray = aToZArray();
			
		System.out.println(mapWordWithFibonacci(text,alphabets,fibonacciArray,alphabetsArray));
		
	}
	
	
	public static int[] fibonacciArrayOfAlphabets(){
		
		int[] FibonacciArray = new int[26];
		FibonacciArray[0] = 0;
		FibonacciArray[1] = 1;

		int t1 = 0, t2 = 1, t3;
		
		for (int i = 2; i < 26; i++) {

			t3 = t1 + t2;

			FibonacciArray[i] = t3;

			t1 = t2;
			t2 = t3;
		}
		
		return FibonacciArray ;
	}

	
	public static char[] aToZArray(){
		
		char[] AtoZarray = new char[26];
		char ch = 'A';

		for (int i = 0; i < 26; i++) {

			AtoZarray[i] = ch;
			ch++;
		}
		
		return AtoZarray ;		
	} 
	
	
	public static int mapWordWithFibonacci(String text ,char[] alphabets , int[] fibonacciArray ,char[] alphabetsArray){
		
		int sum = 0 ;
		
		for(int i = 0 ; i < text.length() ; i++){
			
			for(int j = 0 ; j < 26 ; j++){
				
				if(alphabets[i] == alphabetsArray[j] ){
					
					sum += fibonacciArray[j];
					
				}
			}
		}
		
		return sum ;
	}
}
