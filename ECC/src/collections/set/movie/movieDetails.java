package collections.set.movie;

import java.util.*;

public class movieDetails {

	public static void main(String[] args) {
		
/*
		Movie m1 = new Movie("VAKEEL SAB","VENU SRIRAM", 2.15f);
		Movie m2 = new Movie("KUSHI","PURI", 2.13f);
		Movie m3 = new Movie("GABBER SINGH","HARISH", 2.14f);
		Movie m4 = new Movie("ATHARINTIKI D","TRIVIKRAM", 2.10f);
		Movie m5 = new Movie("RAM BABU","PURI", 1.00f);
		Movie m6 = new Movie("JALSA","TRIVIKRAM", 1.03f);
		Movie m7 = new Movie("GOKULAMLO","PRAVEEN", 2.06f);
		Movie m8 = new Movie("BADRI","PURI", 1.15f);
		Movie m9 = new Movie("AGNATHAVASI","TRIVIKRAM", 2.02f);
		Movie m10 = new Movie("PANJA","KORATALA", 2.05f);
*/		

		HashSet <Movie> movieSet = new HashSet<Movie>();	//use hashSet or linkedSet but no TreeSet because it sorts
													//from ascending to descending which Movie object doesn't offer// 
				
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
		
		System.out.println("Duration > 2 hours : ");		
													//Sets can't use for() loop because storage is not by index
													//But Sets can be accessed by for each() loop
		for(Movie m : movieSet){										
			
			if(m.getDuration() > 2){
				System.out.println(m.getMovieName() + " \t " +m.getDuration());
			}
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		System.out.println("Director's Names & their movies :");
		
		Set<String> directorSet = new HashSet<String>();
		
		
		for(Movie element1 : movieSet){
			String directorName = element1.getDirectorName();
			String movies = "";
			//int count = 0 ;
			
			if(!directorSet.contains(directorName)){
				
				directorSet.add(directorName);
				
				for(Movie element2 : movieSet){
					if(directorName.equalsIgnoreCase(element2.getDirectorName())){
						movies += element2.getMovieName() + "\n" ;
						//count++ ;
					}
				}
				
			//	if(counter condition)
				System.out.println("Movies directed by : " + directorName);
				System.out.println(movies);
				System.out.println("*************************************");
			}
				
				
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
	}

	
	
}
