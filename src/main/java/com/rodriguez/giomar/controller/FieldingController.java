package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.service.FieldingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by giorod on 9/6/2018.
 */
@RestController
@Api(tags = "Fielding", description = "Fielding Endpoints")
public class FieldingController {
    @Autowired
    private FieldingService fieldingService;

    @GetMapping("/fieldings")
    public ResponseEntity<?> findAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){

        return ResponseEntity.ok(fieldingService.findAll(page, size));
    }
    @GetMapping("/{playerId}/fieldings")
    public ResponseEntity findByPlayerId(@PathVariable("playerId") String playerId){
        return ResponseEntity.ok(fieldingService.findByPlayerId(playerId));
    }
}
