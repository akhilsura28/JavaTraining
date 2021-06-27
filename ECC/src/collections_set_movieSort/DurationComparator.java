package collections_set_movieSort;

import java.util.Comparator;

public class DurationComparator implements Comparator <Movie> {

	@Override
	public int compare(Movie c1, Movie c2) {
		
		if(c1.getDuration() > c2.getDuration())
			return 1 ;
		else if(c1.getDuration() < c2.getDuration())
			return -1;
			
		return 0;
	}
}

