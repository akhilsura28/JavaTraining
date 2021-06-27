package method_programs;

import java.util.Scanner;

public class OddOrEvenWithString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to be checked :");

		int num = sc.nextInt();

		System.out.println("The given number is " + isEven(num));

	}

	public static String isEven(int num) {

		String result = "Odd";

		if (num % 2 == 0)

			result = "Even";

		return result;
	}

}
