package basic_programs;

import java.util.*;

public class timeAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input of the first time");
		
		System.out.println("------------------------");
		
		System.out.println("Enter the Hours :");
		
		int hours = sc.nextInt();
		
		System.out.println("Enter the minutes :");
		
		int minutes = sc.nextInt();
		
		System.out.println("Enter the seconds :");
		
		int seconds = sc.nextInt();
		
		//----------------------------------------//
		
		int totalTimeOne = hours*60*60 + minutes*60 + seconds ;
		
		//-----------------------------------------//
		
		System.out.println("Input of the second time");
		
		System.out.println("------------------------");
		
		System.out.println("Enter the Hours :");
		
		int hours2 = sc.nextInt();
		
		System.out.println("Enter the minutes :");
		
		int minutes2 = sc.nextInt();
		
		System.out.println("Enter the seconds :");
		
		int seconds2 = sc.nextInt();
		
		int totalTimeTwo = hours2*60*60 + minutes2*60 + seconds2;
		
		int totalTime = totalTimeOne + totalTimeTwo;
		
		int hours3 = totalTime / 3600;
		
		int minutes3 = (totalTime % 3600)/60;
		
		int seconds3 = minutes3 / 60;
		
		System.out.println("New time is :" + hours3 +" : " + minutes3 + " : " + seconds3);
		
	}

}
