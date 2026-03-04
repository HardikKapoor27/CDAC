package cdac;

public class MovieApp {
	
	public static void main(String[] args) {

		MovieManagement mm = new MovieManagement();

		mm.numberOfMovies();
		Movie[] m = mm.getMovies();
		mm.allMovieMethods(m);
	}

}
