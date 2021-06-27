package collections_set_movieSort;

import java.util.Comparator;

public class DirectorComparator implements Comparator <Movie> {

	@Override
	public int compare(Movie d1, Movie d2) {
			
		return d1.getDirectorName().compareToIgnoreCase((d2.getDirectorName()));

	}

}
