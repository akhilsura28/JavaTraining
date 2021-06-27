package collections_set_movieSort;

import java.util.Comparator;

public class MovieNameComparator implements Comparator <Movie> {

	@Override
	public int compare(Movie n1, Movie n2) {
		
	
		return n1.getMovieName().compareToIgnoreCase(n2.getMovieName());
	}

	
}
