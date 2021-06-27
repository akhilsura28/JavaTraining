package string_progams;

import java.util.Scanner;

public class DisplayMonthNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month :");
		
		String month = sc.next();
		
		String allMonths = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
		
		month = month.substring(0,3).toUpperCase();
		
		int mon = (allMonths.indexOf(month)/3) + 1 ;
		
		System.out.println("The month is : " + mon);
	}

}
