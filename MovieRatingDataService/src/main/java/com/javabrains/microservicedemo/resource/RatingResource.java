package com.javabrains.microservicedemo.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.microservicedemo.model.Rating;
import com.javabrains.microservicedemo.model.UserRating;

@RestController
@RequestMapping("/ratingData")
public class RatingResource {
	 @RequestMapping("/movies/{movieId}")
	    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
	        return new Rating(movieId, 4);
	    }

	@RequestMapping("/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		System.out.println("calling info service");
		 UserRating userRating = new UserRating();
	        userRating.initData(userId);
	        return userRating;
	}

}
