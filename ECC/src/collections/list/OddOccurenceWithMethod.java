package collections.list;

import java.util.*;

public class OddOccurenceWithMethod {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> l1 = new LinkedList<Integer>();
		
		System.out.println("Size of the List : ");
		
		int size = sc.nextInt();
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0 ; i < size ; i++ ){
			l1.add(sc.nextInt());}
		
		System.out.println(l1);
		System.out.println(OddOccurence(l1 , size));
		System.out.println(l1);

	}

	
	
	
	public static String OddOccurence(List l1 , int size){
		
		List<Integer> l2 = new LinkedList<Integer>();
		List<Integer> l3 = new LinkedList<Integer>();
		
		for(int i = 0 ; i < size ; i++){
			int count = 0 ;
			int element1 = (int) l1.get(i);
			
			if(element1 != -1){
				
				for(int j = 0 ; j < size ; j++){
				int element2 = (int) l1.get(j);
					
					if(element1 == element2){
						count++;
						l1.set(j, -1);			
					}
											
				}
				
			}
			
			if(count % 2 != 0){
				l2.add(element1);
				l3.add(count);
			}
			
			
		}
		 
		return l2 +"\n"+ l3;		
	}
}
