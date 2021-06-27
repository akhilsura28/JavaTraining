package collections_set_movieSort;

import java.util.*;

public class MovieDetails {

	public static void main(String[] args) {
		
		
		HashSet <Movie> movieSet = new HashSet<Movie>();	 
				
		movieSet.add(new Movie("VAKEEL SAB","VENU SRIRAM", 2.15f));
		movieSet.add(new Movie("KUSHI","PURI", 2.13f));
		movieSet.add(new Movie("GABBER SINGH","HARISH", 2.14f));
		movieSet.add(new Movie("ATHARINTIKI D","TRIVIKRAM", 2.10f));
		movieSet.add(new Movie("RAM BABU","PURI", 1.00f));
		movieSet.add(new Movie("JALSA","TRIVIKRAM", 1.03f));
		movieSet.add(new Movie("GOKULAMLO","PRAVEEN", 2.06f));
		movieSet.add(new Movie("BADRI","PURI", 1.15f));
		movieSet.add(new Movie("AGNATHAVASI","TRIVIKRAM", 2.02f));
		movieSet.add(new Movie("PANJA","KORATALA", 2.05f));
		
		MovieSort sorting = new MovieSort();
		
		//sorting.getDurationSort(movieSet);
		
		//sorting.getDirectorNameSort(movieSet);
		
		sorting.getMovieNameSort(movieSet);
	}

}
