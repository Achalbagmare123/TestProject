package org.view.question2;

import java.util.Scanner;

import org.model.question2.MovieTheatre;
import org.service.question2.MovieTheaterService;


public class MovieTheaterView {
	static Scanner scanner=new Scanner(System.in);
	public static boolean addMovie() {
		System.out.println("Movie details -");
		System.out.println("Enter movie name:");
		String movieName=scanner.nextLine();
		System.out.println("Enter a movie start time :");
		String movieStartTime=scanner.nextLine();
		System.out.println("Enter a movie end time:");
		String movieEndTime=scanner.nextLine();
		System.out.println("Enter a movie Ticket price :");
		String movieTicketPrice=scanner.nextLine();
		
		MovieTheatre movietheatre=new MovieTheatre("movieName","movieStartTime","movieEndTime","movieTicketPrice");
		MovieTheaterService.addMovie(movietheatre);
		return true;
	}

		public static MovieTheatre[] displayMovie() {
			return MovieTheaterService.displayMovie();
		}

}
