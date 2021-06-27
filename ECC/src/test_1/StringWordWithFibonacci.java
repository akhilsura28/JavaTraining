package test_1;

import java.util.*;

public class StringWordWithFibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word :");

		String text = sc.next().toUpperCase();

		char[] alphabet = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {

			alphabet[i] = text.charAt(i);
		}
		
		
		List<Character> allalphabets = new LinkedList<Character>();
		
		for(char i = 'A' ; i <= 'Z' ; i++){
			allalphabets.add(i);
		}
		
		//System.out.println(allalphabets);
		
		
		List<Integer> fibonacci = new LinkedList<Integer>();
		
		fibonacci.add(0);fibonacci.add(1);fibonacci.add(1);
		
		for (int i = 3; i < 26; i++) {

		fibonacci.add(i, (fibonacci.get(i-1)+fibonacci.get(i-2)));
			
		}
		
		//System.out.println(fibonacci);
		
		
		
		
		int sum = 0 ;
		
		for(int i = 0 ; i < text.length() ; i++){
		
			for(int j = 0 ; j < 26 ; j++){
				
				if(alphabet[i] == allalphabets.get(j)){
					sum = sum + fibonacci.get(j); 
				}
				
			}
			
		}
		
		System.out.println(sum);
		
	}

}
