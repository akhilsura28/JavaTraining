package exceptions;

import java.util.Scanner;

public class finallyBlock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(), n2 = sc.nextInt();

		System.out.println(n1 + n2);

		System.out.println(n1 - n2);

		try {
		
			System.out.println(n1 / n2);
		
		} catch (ArithmeticException a) {

			System.out.println(a.getMessage());
		//	System.out.println("n2 cannot be zero. Please give another number : ");
		//	n2 = sc.nextInt();
		
		} finally {
			System.out.println("executes whether an exception occurs or doesn't occur ");
		}
		

		System.out.println(n1 * n2);
		
		System.out.println(n1 % n2);
						
	}

}
