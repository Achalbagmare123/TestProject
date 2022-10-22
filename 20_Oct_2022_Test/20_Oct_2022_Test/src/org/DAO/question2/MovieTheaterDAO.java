package org.DAO.question2;

import org.model.question2.MovieTheatre;


public class MovieTheaterDAO {
	
	static MovieTheatre movietheareArray[]=new MovieTheatre[5];
	public static boolean addMovie(MovieTheatre movietheatre) {
		boolean result=false;
		
		for(int i=0;i<movietheareArray.length;i++)
		{
			if(movietheareArray[i]==null) {
				movietheareArray[i]=movietheatre;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static MovieTheatre[] displayMovie1() {
		return movietheareArray;
	}

	public static void addMovie1(MovieTheatre movietheare) {
		
		
	}

	public static MovieTheatre[] displayMovie() {
		
		return null;
	}

}
