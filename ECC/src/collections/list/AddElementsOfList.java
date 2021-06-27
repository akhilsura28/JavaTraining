package collections.list;

import java.util.* ;

public class AddElementsOfList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Double> l1 = new ArrayList<Double>();
		
		System.out.println("Enter the size of the list : ");
		
		int size = sc.nextInt();
		
		System.out.println("Enter the numbers of the list : ");
		
		for(int i = 0; i < size ; i++){
			
			l1.add(sc.nextDouble());
		}
		
		
		double sum = 0;
		
		for(int i = 0 ; i < size ; i++){
			
			sum += l1.get(i);
		}
		
		System.out.println(sum);
		
		System.out.println("---------------------------------------------");
		
		
		
		List<String> l2 = new ArrayList<String>();
		
		System.out.println("Enter the number of words in the list : ");
		
		int Size = sc.nextInt();
		
		System.out.println("Enter the words of the list : ");
		
		for(int i = 0 ; i < Size ; i++){
		
			l2.add(sc.next());
		}
		
		
		String line = "" ;
		
		for(int i =0 ; i < Size ; i++){
			line += l2.get(i) + " ";
		}
		
		System.out.println(line);
		
	}

}
