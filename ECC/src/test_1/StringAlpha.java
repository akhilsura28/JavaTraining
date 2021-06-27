package test_1;

import java.util.Scanner;

public class StringAlpha {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
				
		System.out.println(AlphaAndSymbolSeparator(text));	
		
	}
	
///////////////////////////////////////////////////////////////////
	
	
	public static String AlphaAndSymbolSeparator(String text){
			
			
			String alphabets = "" , symbols = "" ;
		
			for(int i = 0 ; i < text.length() ; i++ ){
				
				char ch = text.charAt(i);
				
				if(Character.isAlphabetic(ch)){
					alphabets += ch ; 
				}
				else
					symbols += ch ;
			}
			return symbols+alphabets; 
		} 
	
////////////////////////////////////////////////////////////////////
	
}
