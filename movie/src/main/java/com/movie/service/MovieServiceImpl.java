package com.movie.service;

import com.movie.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService{
    List<Movie> movieList = List.of(new Movie(201L, "Interstellar", 2014, 101L),
                                    new Movie(202L, "Django Unchained", 2013, 103L),
                                    new Movie(203L, "Forrest Gump", 1994, 102L),
                                    new Movie(204L, "Inception", 2010, 101L));

    @Override
    public Movie getMovie(Long id) {
        return movieList.stream().filter(movie -> movie.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<Movie> getMoviesOfDirector(Long directorId) {
        return movieList.stream().filter(movie -> movie.getDirectorId().equals(directorId)).collect(Collectors.toList());
    }
}
