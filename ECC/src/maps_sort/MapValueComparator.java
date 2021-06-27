package maps_sort;

import java.util.Comparator;
import java.util.*;

public class MapValueComparator implements Comparator<Integer> {

	
	private Map<Integer,String> m1 ;
	
	public MapValueComparator (Map<Integer , String> m1){
		
		this.m1 = m1 ;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		String value1 = m1.get(o1);
		String value2 = m1.get(o2);
		
		return value1.compareToIgnoreCase(value2);
	}
	
	
/*	@Override
	public int compare(Integer o1, Integer o2) {
	
		return m1.get(o1).compareToIgnoreCase(m1.get(o2));
	}
*/
	
	
	
}
