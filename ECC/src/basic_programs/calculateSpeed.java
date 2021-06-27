package basic_programs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calculateSpeed {

	/*program to calculate speed given distance and time, 
	where both distance and time are integers*/
	
	public static void main(String[] args) {
		
		System.out.println("Calculating Speed given distance and time:");
		
		System.out.println("------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Average distance travelled (km):");
		
		int distance = sc.nextInt();
		
		System.out.println("Enter the Average time taken (Hr):");
		
		int time = sc.nextInt();
		
		double speed = distance/(double)time;
		
		DecimalFormat d = new DecimalFormat("0.###");
		speed = Double.parseDouble(d.format(speed));
		
		System.out.println("The speed of the entire journey(km/Hr) is:" + "\n" + speed);
			
	}

}
