package org.model.question2;

import java.util.Objects;

public class MovieTheatre {
	private String movieName;
	private String movieStartTime;
	private String movieEndTime;
	private String movieTicketPrice;
	
	public MovieTheatre() {
		
	}

	public MovieTheatre(String movieName, String movieStartTime, String movieEndTime, String movieTicketPrice) {
		super();
		this.movieName = movieName;
		this.movieStartTime = movieStartTime;
		this.movieEndTime = movieEndTime;
		this.movieTicketPrice = movieTicketPrice;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieStartTime() {
		return movieStartTime;
	}

	public void setMovieStartTime(String movieStartTime) {
		this.movieStartTime = movieStartTime;
	}

	public String getMovieEndTime() {
		return movieEndTime;
	}

	public void setMovieEndTime(String movieEndTime) {
		this.movieEndTime = movieEndTime;
	}

	public String getMovieTicketPrice() {
		return movieTicketPrice;
	}

	public void setMovieTicketPrice(String movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}
	public String toString() {
		return "MovieTheatre [movieName=" + movieName + ", movieStartTime=" + movieStartTime + ", movieEndTime="
				+ movieEndTime + ", movieTicketPrice=" + movieTicketPrice + "]";
	}

	public int hashCode() {
		return Objects.hash(movieEndTime, movieName, movieStartTime, movieTicketPrice);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieTheatre other = (MovieTheatre) obj;
		return movieEndTime == other.movieEndTime && Objects.equals(movieName, other.movieName)
				&& movieStartTime == other.movieStartTime && movieTicketPrice == other.movieTicketPrice;
	}
	
	
	
}
