package com.director.entity;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private Long id;
    private String name;
    private List<Movie> movies;

    public Director(Long id, String name) {
        this.id = id;
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public Director(Long id, String name, List<Movie> movies) {
        this.id = id;
        this.name = name;
        this.movies = movies;
    }

    public Director() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
