package string_progams;

import java.util.Scanner;

public class SpeedCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the distance in metre :");
		
		int distance = sc.nextInt();
		
		System.out.println("Enter the time in hh:mm:ss format :");
		
		String time = sc.next();			//"HH:MM:SS" 
		
		int timeInSec = totalTimeInSec(time) ;
		
		double speed = (double)distance / timeInSec ;
		
		System.out.println("The speed in m/sec is :" + speed);
		
		
	}
	
	public static int totalTimeInSec(String time){
		
		String[] timeParts = time.split(":");
		
		int hh = Integer.parseInt(timeParts[0]) ;
		
		int mm = Integer.parseInt(timeParts[1]) ;
		
		int ss = Integer.parseInt(timeParts[2]) ;
			
		int timeInSec = hh*60*60 + mm* 60 + ss ;
		
		
		return timeInSec;}
		
}
