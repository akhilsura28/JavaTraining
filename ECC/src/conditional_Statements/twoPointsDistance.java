package conditional_Statements;

import java.util.*;

public class twoPointsDistance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Coordinates X1 and Y1 :");
		
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		
		System.out.println("Enter the Second Coordinates X2 and Y2 :");
		
		int X2 = sc.nextInt();
		int Y2 = sc.nextInt();
		
		double distance = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
		
		double dist =Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1, 2));
		
		System.out.println("The distance is :" + "\n"+ distance);
		
		System.out.println("Distance between" + "("+X1+" , "+Y1+")" + "("+X2+" , "+Y2+") " + "is :"  + dist);

		
	}

}
