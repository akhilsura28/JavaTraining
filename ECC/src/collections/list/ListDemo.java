package collections.list;

import java.util.* ;

public class ListDemo {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(56);
		l1.add(89);
		l1.add(2.3f);
		l1.add("String");
		
		System.out.println(l1);
		l1.add(3, 456.34);			// moves the data in index 3 to next index //
		System.out.println(l1);
		
		l1.remove(3);				//removes element in the index 3 //
		System.out.println(l1);
		l1.remove("String");
		System.out.println(l1);
		
		
		List <Integer> l2 = new ArrayList <Integer> ();
		//Wrapper classes : Integer ; Float ; Character ; Double ; Boolean ; Byte ; Short ;
		
		l2.add(56);
		l2.add(89);
		l2.add(1500);
		l2.add(56);
		l2.add(78);
		 
		System.out.println(l2);
		System.out.println(l2.indexOf(56));
		System.out.println("Index of 78 : " + l2.indexOf(78));

		l2.add(1,77);
		System.out.println(l2);
		
		l2.set(3, 6400);			// replaces the data in index 3 with 6400 // 
		System.out.println(l2);
		
		System.out.println("89 contains : " + l2.contains(89));
		System.out.println("209 contains : " + l2.contains(209));
		
		
		List <Integer> l3 = new LinkedList <Integer> ();
		l3.add(301);
		l3.add(307);
		l3.add(null);
		l3.add(303);
		l3.add(58);
		
		List<Character> l4 = new LinkedList <Character> ();
		
		
		
		System.out.println("l3 : " + l3);
		l3.add(1, 47);
		System.out.println(l3);
		
		l3.addAll(l1);
		System.out.println(l3);
		
		l3.addAll(3, l1);
		System.out.println(l3);
		
		l3.removeAll(l1);
		System.out.println(l3);
		
		System.out.println("****************************************************************");
		
		Collections.sort(l2);
		System.out.println(l2);
		
		
	}
}
