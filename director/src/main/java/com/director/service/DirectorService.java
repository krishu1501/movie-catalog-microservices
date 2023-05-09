package com.director.service;

import com.director.entity.Director;
import org.springframework.stereotype.Service;


public interface DirectorService {
    public Director getDirector(Long id);
}
