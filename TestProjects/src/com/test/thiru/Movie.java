package com.test.thiru;

import java.util.Objects;

public class Movie {

	private String movieName;
	private String releaseYear;
	private Integer rating;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Movie(String movieName, String releaseYear, Integer rating) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", releaseYear=" + releaseYear + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(movieName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(movieName, other.movieName);
	}
	
	
}
