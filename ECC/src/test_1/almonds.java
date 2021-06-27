package test_1;

import java.util.Scanner;

public class almonds {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("No of days the almonds should last :");

		int n = sc.nextInt();

		long numOfAlmondsForNDays = numOfAlmondsNeeded(n);

		System.out.println(numOfAlmondsForNDays + " almonds are needed for " + n + " days ");

	}

	public static long numOfAlmondsNeeded(int n) {

		long[] numOfAlmondsPerDay = new long[n + 1];

		long t1 = 2, t2 = 3, t3 = 5, t4;
		numOfAlmondsPerDay[0] = 0;
		numOfAlmondsPerDay[1] = 2;
		numOfAlmondsPerDay[2] = 3;
		numOfAlmondsPerDay[3] = 5;

		for (int i = 4; i <= n; i++) {

			t4 = t1 + t2 + t3;

			numOfAlmondsPerDay[i] = t4;

			t1 = t2;
			t2 = t3;
			t3 = t4;
		}

		return numOfAlmondsPerDay[n];
	}
}
