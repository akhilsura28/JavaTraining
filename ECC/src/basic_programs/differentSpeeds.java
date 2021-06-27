package basic_programs;

import java.util.Scanner;

/*distance (in meters) and
 *  the time was taken (as three numbers: hours, minutes, seconds), 
 * and display the speed, in meters per second, 
 * kilometers per hour and
 *  miles per hour (hint: 1 mile = 1609 meters)*/
public class differentSpeeds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the distance travelled (km):");
		
	    double distance = sc.nextDouble();
	   
	    System.out.println("Enter the time taken:");
	    
	    System.out.println("Hours :");
	    
	    double hours = sc.nextDouble();
	    
	    System.out.println("minutes :");
	    
	    int minutes = sc.nextInt();
	    
	    System.out.println("seconds :");
	    
	    int seconds = sc.nextInt();
	    
	    double time = hours + (double)minutes/60 + (double)seconds/3600;
	    
	    double speed = (distance)/time;
	    
	    System.out.println("The speed in km/hr is :" + speed);

	    System.out.println("---------------------------------");
	    
	    double time2 = hours*60*60 + minutes*60 + seconds;
	    
	    double speed2 = (distance*1000)/time2;
	    
	    System.out.println("The speed in m/s is   :" + speed2);
	    
	    System.out.println("---------------------------------");
	    
	    double speed3 = (distance/(1.6*time));
	    
	    System.out.println("The speed in miles/hr :" + speed3);
	    
	    System.out.println("---------------------------------");
	}

}
