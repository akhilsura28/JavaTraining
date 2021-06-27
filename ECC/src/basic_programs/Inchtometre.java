package basic_programs;

import java.util.Scanner;

public class Inchtometre {

	public static void main(String[] args) {
		
 Scanner con = new Scanner(System.in);

 System.out.println("Enter the inches:");

double inch= con.nextDouble();

double metre= inch*0.0254; // 1 metre = 39.37 inches

System.out.println(inch + " inches in " + " metre: " + metre +" m");

con.close();

	}

}
