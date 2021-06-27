package method_programs;

import java.util.Scanner;

public class CalculateSpeed {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the distance in km :");
		
		int distance = sc.nextInt();
		
		System.out.println("Enter the time in hr :");
		
		double time = sc.nextDouble();
		
		System.out.println("The speed is :" + calSpeed(distance,time) + " km/hr");

		
	}
		
	
	public static double calSpeed(int distance, double time){
		
	//	double speed = distance / time ;
		
		return distance/time ;
		
	//	return speed ;
	}
}
