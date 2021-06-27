package collections_set_movieSort;

import java.util.*;

//import collections.set.movie.Movie;

public class MovieSort {
					
					//Here, collection itself is given as argument//
	
	public void getDurationSort(HashSet <Movie> movieSet){	
	/*	for(Movie m : movieSet){
			System.out.println(m);
		}
	*/
		
	/*	TreeSet <Movie> movieTreeSet = new TreeSet <Movie>();
		movieTreeSet.addAll(movieSet);
														//PRODUCES ERROR AS TREESET UNABLE TO FIND ON WHAT BASIS
														IT HAS TO SORT THE MOVIE DATA //		 
		for(Movie m : movieSet){
			System.out.println(m);
		}
	*/	
		
		
		DurationComparator duration = new DurationComparator();
		
		TreeSet <Movie> movieTreeSet = new TreeSet <Movie>(duration);
		movieTreeSet.addAll(movieSet);
																 
		for(Movie m : movieTreeSet){
			System.out.println(m);
		}
		
	}
	
	
	public void getDirectorNameSort(HashSet<Movie> movieSet){
		
		DirectorComparator dir = new DirectorComparator();
		
		Set <Movie> movieTreeSet = new TreeSet <Movie>(dir);
		movieTreeSet.addAll(movieSet);
		
		for(Movie m : movieTreeSet){
			System.out.println(m);
		}
	}
	
	
	public void getMovieNameSort (HashSet<Movie> movieSet){
		
		MovieNameComparator name = new MovieNameComparator();
		
		Set <Movie> nameTreeSet = new TreeSet <Movie>(name);
		nameTreeSet.addAll(movieSet);
		
		for(Movie m : nameTreeSet){
			System.out.println(m);
		}			
	}
	
	
}
