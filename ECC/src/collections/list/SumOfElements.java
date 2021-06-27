package collections.list;

import java.util.* ;

public class SumOfElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> elements = new ArrayList<Character>();
		
		System.out.println("Number of Elements : ");
		
		int size = sc.nextInt() ;
		
		System.out.println("Enter the Elements :");
		
		for(int i = 0 ; i < size ; i++){
			
			elements.add(sc.next().charAt(0));
			
		}
		
		
		String result = "" ;
		
		for(Character c : elements){
			
			result += c ;
		}

		
		System.out.println(result);
		
	}

}
