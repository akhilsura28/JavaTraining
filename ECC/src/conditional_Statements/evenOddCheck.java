package conditional_Statements;

import java.util.*;

public class evenOddCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		
	}

}
