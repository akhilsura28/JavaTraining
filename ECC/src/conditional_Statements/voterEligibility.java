package conditional_Statements;

import java.util.*;

public class voterEligibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the Citizen : ");

		float age = sc.nextFloat();
		
		if (age >= 18)
			System.out.println("The person eligible to vote !");
		else
			System.out.println("The person is not eligible to vote !");
	}

}
