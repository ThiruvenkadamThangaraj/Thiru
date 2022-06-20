package com.javabrains.microservicedemo.model;

public class Movie {

	private String movieId;
	private String name;
	private String overView;
	
	public Movie(String movieId, String name, String overView) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.overView = overView;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public String getOverView() {
		return overView;
	}
	public void setOverView(String overView) {
		this.overView = overView;
	}
	
	
}
