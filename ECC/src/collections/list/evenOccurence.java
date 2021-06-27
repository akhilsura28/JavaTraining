package collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class evenOccurence {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		List<Integer> inputList = new LinkedList<Integer>();
		
		for(int i = 0; i < length ; i++){
			inputList.add(sc.nextInt());
		}
		
		List<Integer> evenOccurence = new LinkedList<Integer>();
		List<Integer> count = new LinkedList<Integer>();
		
		for(int i = 0; i < length; i++){
			
			int counter = 0;
			int num1 = inputList.get(i); 
			
			if(num1 != 0){
				
				for(int j = 0 ; j < length; j++){
					
					int num2 = inputList.get(j);
					
					if(num1 == num2){
						counter++;
						inputList.set(j, 0);
					}
					
				}
							
			}
			
			if(counter % 2 == 0){
				//evenOccurence.add(num1);
				//count.add(counter);
				System.out.println(num1 +"  "+ counter);
			}
			
		}
			
			//System.out.println(inputList);
			//System.out.println(evenOccurence);
			//System.out.println(count);
		
	}

	
	
}
