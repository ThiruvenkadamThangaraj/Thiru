package com.test.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {

		List<Movie> movieList = Arrays.asList(new Movie("Movie1", "2021", 3), new Movie("Movie2", "2021", 4),
				new Movie("Movie3", "2022", 4),
				new Movie("Movie4", "2023", 3));

		Map<Boolean, List<Movie>> moviepartition = movieList.stream()
				.collect(Collectors.partitioningBy(m -> m.getRating() ==3));
		System.out.println(moviepartition);
		double getMax=movieList.stream().mapToInt(x->x.getRating()).summaryStatistics().getCount();
		System.out.println("MovieList Maximum"+getMax);
		Long movieCount=movieList.stream().collect(Collectors.counting());
		System.out.println(movieCount);
		/*
		 * System.out.println(movieList.stream().collect(Collectors.averagingInt(Movie::
		 * getRating)));1
		 * 
		 * Map<Integer,List<Movie>>movieGroupby=movieList.stream().collect(Collectors.
		 * groupingBy(Movie::getRating)); movieGroupby.keySet().forEach(k -> {
		 * if(k.equals(3)) { System.out.println(movieGroupby.get(k)); } });
		 * movieGroupby.values().forEach(v -> { if(v.equals(3)) {
		 * System.out.println(movieGroupby.get(v)); } });
		 */

	}

}
