package maps;

import java.util.*;

public class MapsDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		
		m1.put(2, "apple");
		m1.put(4, "mango");
		m1.put(10, "pineapple");
		m1.put(15, "grapes");
		m1.put(87, "walnut");
		m1.put(197, "banana");
		m1.put(71, "orange");
		
		System.out.println(m1);
		System.out.println(m1.containsKey(10));
		System.out.println(m1.containsValue("Walnut"));
		System.out.println(m1.containsValue("walnut"));
		
		System.out.println("value in 15th key : " + m1.get(15));
		System.out.println(m1.isEmpty());
		
		//m1.clear();
		//System.out.println(m1.isEmpty());
		//System.out.println(m1);
		
		m1.remove(2);
		System.out.println(m1);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		TreeMap<Character,Integer> m2 = new TreeMap<Character,Integer>();
		
		m2.put('a', 870);
		m2.put('z', 300);
		m2.put('A', 100);
		m2.put('D', 64);
		m2.put('D', 999);
		
		System.out.println(m2);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		LinkedHashMap<Integer,String> m3 = new LinkedHashMap<Integer,String>();
		
		m3.putAll(m1);
		
		m3.put(5, "kiwi");
		
		System.out.println(m3);
		
		System.out.println(m3.get(5));
	}

}
