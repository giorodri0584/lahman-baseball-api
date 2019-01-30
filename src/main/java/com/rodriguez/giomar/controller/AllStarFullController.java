package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.repository.AllStarFullRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AllStarFullController {
    @Autowired
    private AllStarFullRepository repository;

    @GetMapping("/allstars")
    public ResponseEntity findALl(){
        return ResponseEntity.ok().body(repository.findAll());
    }
}
