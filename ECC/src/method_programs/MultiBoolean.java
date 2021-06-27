package method_programs;

import java.util.Scanner;

public class MultiBoolean {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);

		System.out.println("First Boolean :");
		
		boolean b1 = sc.nextBoolean() ;
		
		System.out.println("second Boolean :");
		
		boolean b2 = sc.nextBoolean();
		
		System.out.println("third Boolean :"); 
		
		boolean b3 = sc.nextBoolean();
		
		System.out.println(checkBoolean(b1,b2,b3));
			
	}
	
	public static boolean checkIfBoolean(boolean b1 , boolean b2 , boolean b3){
		
		if(b1 && b2 && b3 == true)
			return false ;
		
		else if (b1 && b2 || b2 && b3 || b3 && b1 == true)
			return true ;
		
		else 
			
			return false ;	
	}
	
	public static boolean checkBoolean(boolean b1 , boolean b2 , boolean b3){
		
		int count = 0 ;
		
		if(b1)
			count++ ;
		if(b2)
			count++ ;
		if(b3)
			count++ ;
		
		return count == 2 ;
	}

}
