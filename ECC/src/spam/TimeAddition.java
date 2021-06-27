package spam;

import java.util.Scanner;
import java.lang.*;

public class TimeAddition {

	public static void main(String[] args) {
		boolean isNextDay = false;
		String newTSS = "";
		String newTMM = "";
		String newTHH = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the time in Hours");
		System.out.println("enter the time in Minutes");
		System.out.println("enter the time in Seconds");
		
		int tH1 = sc.nextInt();
		int tM1 = sc.nextInt();
		int tS1 = sc.nextInt();
		
		System.out.println("enter the time in Hours");
		System.out.println("enter the time in Minutes");
		System.out.println("enter the time in Seconds");

		int tH2 = sc.nextInt();
		int tM2 = sc.nextInt();
		int tS2 = sc.nextInt();
		
		int newTS = tS1 + tS2;
		if(newTS >= 60) {
			tM1++;
			newTS = newTS % 60;
		}
		
		int newTM = tM1 + tM2;
		if(newTM >= 60) {
			tH1++;
			newTM = newTM % 60;
		}
		
		int newTH = tH1 + tH2;
		if(newTH >= 24) {
			isNextDay = true;
			newTH = newTH % 24;
		}
		
		if(newTS < 10)
			newTSS = "0" + newTS ;
		else
			newTSS = newTS + "";
		
		if(newTM < 10)
			newTMM = "0" + newTM;
		else
			newTMM = newTM + "";
		
		if(newTH < 10)
			newTHH = "0" + newTH;
		else
			newTHH = newTH + "";
		
		if(isNextDay)
			System.out.println("Next Day " + newTHH + ":" + newTMM + ":" + newTSS);
		else
			System.out.println("Same Day " + newTHH + ":" + newTMM + ":" + newTSS);
	}
}