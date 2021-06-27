package maps_sort;

import java.util.*;

public class mapsDemoInfo {

	public static void main(String[] args) {

		TreeMap<Integer, String> m1 = new TreeMap<Integer, String>();

		m1.put(2, "apple");
		m1.put(4, "mango");
		m1.put(10, "pineapple");
		m1.put(15, "grapes");
		m1.put(87, "walnut");
		m1.put(197, "banana");
		m1.put(71, "orange");

		for(Map.Entry<Integer, String> run : m1.entrySet()){
			System.out.println(run);
		}
		
		System.out.println("***************************************************");
		
		System.out.println("Sorting Based on Values : ");
		
		MapValueComparator sorter = new MapValueComparator(m1);
		
		TreeMap <Integer , String> m2 = new TreeMap <Integer , String>(sorter);
		
		m2.putAll(m1);
		for(Map.Entry<Integer, String> run : m2.entrySet()){
			System.out.println(run);
		}
		
		
		System.out.println("*****************************************************");
		
		System.out.println("Sorting in Descending Order : ");
		
		DescendingOrderComparator sort = new DescendingOrderComparator(m1);
		
		TreeMap <Integer , String> m3 = new TreeMap <Integer , String>(sort);
		
		m3.putAll(m1);
		for(Map.Entry<Integer, String> run : m3.entrySet()){
			System.out.println(run);
		}
	}

}
