package maps_sort;

import java.util.*;

public class DescendingOrderComparator implements Comparator<Integer> {

	private Map <Integer,String> m1 ;
	
	public DescendingOrderComparator(Map<Integer, String> m1) {
		this.m1 = m1;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2)
			return -1;
		else if(o1 < o2)
			return 1;
		
		return 0;
	}	
}
