package exceptions_userDefined;

import java.util.*;

public class AgeEligibility {

	public static void main(String[] args) throws AgeInvalidException {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age < 18)
			throw new AgeInvalidException("age must be greater than 18 ");
		else
			System.out.println("age ="+ age);
		
	}

}
