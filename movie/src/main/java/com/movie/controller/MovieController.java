package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") Long movieId){
        return movieService.getMovie(movieId);
    }
    @GetMapping("/director/{directorId}")
    public List<Movie> getMovieList(@PathVariable("directorId") Long directorId){
        return movieService.getMoviesOfDirector(directorId);
    }

}
