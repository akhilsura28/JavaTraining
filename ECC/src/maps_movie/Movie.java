package maps_movie;

public class Movie {

	
	private String movieName , directorName ;
	
	private float duration;

	public Movie(){}
	
	public Movie(String movieName, String directorName, float duration) {
		this.movieName = movieName;
		this.directorName = directorName;
		this.duration = duration;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", directorName=" + directorName + ", duration=" + duration + "]";
	}
	
	
	
}
