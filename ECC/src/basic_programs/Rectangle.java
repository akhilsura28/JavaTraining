package basic_programs;

import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		
		System.out.println("Finding the area of a Rectangle:");
		
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		
		double length = sc.nextDouble();
		
		System.out.println("Enter the breadth:");
		
		double breadth = sc.nextDouble();
		
		double area= length*breadth;
		
		System.out.println("The area of the rectangle with length: "+ length + " and breadth : "+ breadth + " is :"  + area);
		
	return ;
	
	}

}
