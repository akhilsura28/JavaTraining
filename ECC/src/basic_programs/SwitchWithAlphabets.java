package basic_programs;

import java.util.Scanner;

public class SwitchWithAlphabets {

	public static void main(String[] args) {
		
		System.out.println("Enter the ALPHABET to be checked :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch){
			
		case 'a'|'A' : System.out.println("Vowel"); 
		break;
		case 'e'|'E' : System.out.println("Vowel"); 
		break;
		case 'i'|'I' : System.out.println("Vowel"); 
		break;
		case 'o'|'O' : System.out.println("Vowel"); 
		break;
		case 'u'|'U' : System.out.println("Vowel"); 
		break;
		default : System.out.println("Consonent");
		
		}

	}
	
	

}
