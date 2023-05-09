package com.movie.service;

import com.movie.entity.Movie;

import java.util.List;

public interface MovieService {
    public Movie getMovie(Long id);
    public List<Movie> getMoviesOfDirector(Long directorId);
}
