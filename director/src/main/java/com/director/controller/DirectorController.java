package com.director.controller;

import com.director.entity.Director;
import com.director.entity.Movie;
import com.director.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DirectorService directorService;
    @GetMapping("/{directorId}")
    public Director getDirector(@PathVariable("directorId") Long directorId){

        Director director = directorService.getDirector(directorId);
        List<Movie> movieList = restTemplate.getForObject("http://movie-service/movie/director/"+directorId, List.class);
//        List<Movie> movieList = restTemplate.getForObject("http://localhost:9002/movie/director/"+directorId, List.class);
        director.setMovies(movieList);
        return director;
    }
}
