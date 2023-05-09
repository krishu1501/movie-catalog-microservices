package com.director.service;

import com.director.entity.Director;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService{

    List<Director> directors = List.of(new Director(101L, "Christopher Nolan"),
            new Director(102L, "Robert Zemeckis"),
            new Director(103L, "Quentin Tarantino"));

    @Override
    public Director getDirector(Long id) {
        return directors.stream().filter(director -> director.getId().equals(id)).findAny().orElse(null);
    }
}
