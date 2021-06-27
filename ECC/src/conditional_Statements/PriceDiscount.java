package conditional_Statements;

import java.util.*;

public class PriceDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the displayed price :");
		
		int price = sc.nextInt();
		
		double finalPrice = 0;
		
		if (price < 10000){
			
			finalPrice = price*(90/100.0);
			System.out.println("The discount is 10 % ");
			
		}
		if (price > 20000){
			
			finalPrice = price*(75/100.0);
			System.out.println("The discount is 25 % ");
			
		}
		if (price >= 10000 && price <= 20000 ){  
			
			finalPrice = price*(80/100.0);
			System.out.println("The discount is 20 % ");
		}
			
		System.out.println("The final price is :" + finalPrice);
		
	}
}
