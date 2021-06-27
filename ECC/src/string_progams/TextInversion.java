package string_progams;

import java.util.Scanner;

public class TextInversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = "This Is a SAMPLE text!";
		
		String result = "";
		

		for(int i = 0 ; i < text.length() ; i++){
				char ch = text.charAt(i);
			
			if(Character.isAlphabetic(ch)){
				
				if(Character.isLowerCase(ch))
					result += Character.toUpperCase(ch);
				else
					result += Character.toLowerCase(ch);
			}
			else
					result += ch;
		}
		
		System.out.println(result);
		
	}		
}

