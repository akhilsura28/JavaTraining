package exceptions;

import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(), n2 = sc.nextInt();

		System.out.println(n1 + n2);

		System.out.println(n1 - n2);

		try {
			
			System.out.println(n1 / n2);
		
		} catch (ArithmeticException a) {							//CATCH BLOCK IS USED TO HANDLE 
																	//THE EXCEPTIONS ARISED IN TRY BLOCK
			System.out.println(a.getMessage());
		//	System.out.println("n2 cannot be zero. Please give another number : ");
		//	n2 = sc.nextInt();
		}

		System.out.println(n1 * n2);
		
		System.out.println(n1 % n2);
				
	}

}
