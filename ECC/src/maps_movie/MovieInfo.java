package maps_movie;

import java.util.*;

import collections.set.movie.Movie;

public class MovieInfo {

	public static void main(String[] args) { }

	
	public void getMovieNames(HashSet<Movie> movieSet){
		
		TreeMap<String , List<String> > m1 = new TreeMap<String , List<String> >();
		
		for(Movie m : movieSet){
			String directorName = m.getDirectorName();
			String movieName = m.getMovieName();
			
			List<String> movies = new ArrayList<String>();		
			
			
		if(!m1.containsKey(directorName)){
			movies.add(movieName);
			m1.put(directorName, movies);
		}else{
			
			movies = m1.get(directorName);
			movies.add(movieName);
			m1.put(directorName, movies);
		}
	}
		
		
		for(Map.Entry<String, List<String>> e : m1.entrySet()){
			
			List<String> movies = e.getValue();
			if(movies.size() > 1){
				System.out.println(e.getKey() + " : " + movies);
			}
		}

	}
	
}
