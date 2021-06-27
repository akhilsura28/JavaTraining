/*
In the given integer array, find the elements that appear odd number 
of times in the array using ArrayList.

Input : {1,1,2,1, 3,2,3,4,4,3,4,4,6}
*/

package collections.list;

import java.util.*;

public class OddOccurence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> l1 = new LinkedList<Integer>();
		
		System.out.println("Size of the List : ");
		
		int size = sc.nextInt();
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0 ; i < size ; i++ ){
			l1.add(sc.nextInt());
		}
		
		System.out.println(l1);
		
		
		for(Integer element : l1){
			
			int count = 0 ;
			
			if(element != -1){
			
				for(int i = 0 ; i < size ; i++){
				int element2 = l1.get(i);
				
					if(element == element2){
						count++;
						l1.set(i, -1);		
					}
					
				}
				
			}
			
			if(count % 2 != 0)
				System.out.println(element + " " + count );
			
		}

	//	System.out.println(l1);
	}

}
