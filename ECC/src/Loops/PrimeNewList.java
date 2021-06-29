package Loops;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNewList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting Point :");
		
		int startPoint = sc.nextInt();
		
		System.out.println("Enter the Ending Limit :");
		
		int endLimit = sc.nextInt();
		
		List<Integer> primeList = new LinkedList<Integer>();
		
		for(int i = startPoint ; i <= endLimit ; i++){
			
			int count = 0;
			
			for(int j = 2; j <= Math.sqrt(i); j++){
				
				if(i % j == 0)
					++count;
				
			}
			
			if(count == 0)
				primeList.add(i);
			
		}
		
		System.out.println(primeList);
		System.out.println(primeList.size());
		

	}

}
