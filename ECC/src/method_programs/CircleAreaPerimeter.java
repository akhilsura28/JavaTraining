package method_programs;

import java.util.Scanner;

public class CircleAreaPerimeter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle :");
		
		int radius = sc.nextInt();
		
		System.out.println("Area of the circle is :" + area(radius));
		
		System.out.println("Perimeter of the circle is :" + perimeter(radius));
		
	}
	
	public static double area(int radius){
		
		return (Math.PI)*(Math.pow(radius, 2));
	}
	
	public static double perimeter(int radius){
		
		double perimeter = 2*(Math.PI)*(radius);
		
		return perimeter;
	}
}
