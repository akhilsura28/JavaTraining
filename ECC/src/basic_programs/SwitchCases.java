package basic_programs;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		
		System.out.println("Enter the YEAR to be checked :");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		try{
			
			switch(isYearLeap(year)){
			
			case 1 : System.out.println(year + " is a Leap Year !");
			break;
			case 0 : System.out.println(year + " is not a Leap Year !");
			break;
			default : System.out.println("Invalid Attempt !");
			
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static int isYearLeap(int year){
		if((year%4==0 && year%100!=0 || year%400==0))
				return 1;
		else
				return 0;				
	}
	
}
