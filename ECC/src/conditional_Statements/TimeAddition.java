package conditional_Statements;

import java.util.Scanner;

public class TimeAddition {

	public static void main(String[] args) {
		
		//boolean nextDay = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Time - HH : MM : SS ");

		int HH1 = sc.nextInt();
		int MM1 = sc.nextInt();
		int SS1 = sc.nextInt();
		
		System.out.println("Enter the Second Time - HH : MM : SS ");

		int HH2 = sc.nextInt(); 
		int MM2 = sc.nextInt();
		int SS2 = sc.nextInt();
		
		System.out.println("------------------------------------- ");
		
		int SS = SS1 + SS2 ;
		int MM = MM1 + MM2 ;
		int HH = HH1 + HH2 ;
		
		if (SS >= 60){
			MM++;
			SS = SS % 60;
		}
			
		if (MM >= 60){
			HH++;
			MM = MM % 60;
		}
			
		if(HH >= 24){
			//nextDay = true;
			HH = HH % 24;
			System.out.println("Next Day :" + "The sum of the Times is - HH : MM : SS  " + HH + ":" + MM + ":" + SS);
		} 
		else
			
			System.out.println("Same day :" + "The sum of the Times is - HH : MM : SS  " + HH + ":" + MM + ":" + SS);
	}

}
