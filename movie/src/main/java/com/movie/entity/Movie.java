package com.movie.entity;

public class Movie {

    private Long id;
    private String name;
    private int releaseYear;
    private Long directorId;

    public Movie(Long id, String name, int releaseYear, Long directorId) {
        this.id = id;
        this.name = name;
        this.releaseYear = releaseYear;
        this.directorId = directorId;
    }

    public Movie() {
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

}
