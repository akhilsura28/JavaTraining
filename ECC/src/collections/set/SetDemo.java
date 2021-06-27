package collections.set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Float> s1 = new HashSet<Float>(); // HashSet -- can't predict how the data is going to be stored //
		
		s1.add(34.56f);
		s1.add(0.9f);
		s1.add(9.66f);
		s1.add(10.9f);		// original
		s1.add(6.2f);
	//	s1.add(null);		// TreeSet doesn't accept NULL //
		s1.add(11.3f);
		s1.add(10.9f);		// HashSet doesn't accept duplicate values //
		
		System.out.println(s1);	//HashSet data display and storage unordered // 
		

		Set<Character> s2 = new LinkedHashSet<Character>();
		s2.add('a');
		s2.add('e');
		s2.add('i');
		s2.add('o');
		s2.add('e');		// not accepting duplicates //
		s2.add(null);		
		
		System.out.println(s2);		//LinkedHashSet data display and storage ordered //
		
		
		Set<Float> s3 = new TreeSet<Float>();	
		s3.addAll(s1);
		System.out.println(s3);		// TreeSet doesn't accept null values //
		
		
		
	}
}
