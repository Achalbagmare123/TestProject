package org.service.question2;

import org.DAO.question2.MovieTheaterDAO;
import org.model.question2.MovieTheatre;



public class MovieTheaterService {
	public static boolean addMovie(MovieTheatre movietheare) {
		boolean result=false;
		MovieTheaterDAO.addMovie(movietheare);
		return result;
	}
	public static MovieTheatre[] displayMovie() {
		return MovieTheaterDAO.displayMovie();
	}

	public static void addMovie1(MovieTheatre movietheatre) {
		
	}

	public static MovieTheatre[] displayMovie1() {
		return null;
	}

}
