package collections.set;

import java.util.* ;

public class CountEvenOddNumOfSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Set<Integer> elementSet = new TreeSet<Integer>();

		
		System.out.println("No of Elements : ");
		int size = sc.nextInt();
		
		
		System.out.println("Enter the numbers :");
		for(int i = 0 ; i < size ; i++){
			elementSet.add(sc.nextInt());
		}
		
		
		System.out.println(elementSet);
		
		
		int evenCount = 0 ; int oddCount = 0 ;
		Set<Integer>evenSet = new HashSet<Integer>();
		Set<Integer>oddSet = new HashSet<Integer>();
				
				
		for(Integer currElement : elementSet){
			
			if(currElement % 2 == 0){
				evenSet.add(currElement);
				evenCount++;}
			else{
				oddSet.add(currElement);
				oddCount++;}
			
		}
		
		System.out.println(evenSet);
		System.out.println("even :" + evenCount);
		System.out.println(oddSet);
		System.out.println("odd :" + oddCount);
		
	}

}
