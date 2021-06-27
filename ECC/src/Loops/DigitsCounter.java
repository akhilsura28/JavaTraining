package Loops;

import java.util.Scanner;

public class DigitsCounter {

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
    	
    	Scanner sc= new Scanner (System.in);
    	   
        long num = sc.nextLong();
        
        int count = 0;
    	
    	while(num > 0){	
    		num = num / 10 ;
    		count ++;
    	}
    	
    	System.out.println(count + " digits");
	}

}
