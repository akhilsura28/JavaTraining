package exceptions;

import java.util.Scanner;

public class throwsKeyword {

	public static void main(String[] args) {
		try {

			method();
			
		} catch (Exception a) {

			a.printStackTrace();
		}

		System.out.println();
	}

	
	public static void method() throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(), n2 = sc.nextInt();

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 / n2);
		System.out.println(n1 * n2);
		System.out.println(n1 % n2);

	}
}
