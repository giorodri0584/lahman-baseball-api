package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.service.PitchingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by giorod on 8/22/2018.
 */
@RestController
@Api(tags = "Pitching", description = "Pitching Endpoints")
@RequestMapping("/api")
public class PitchingController {
    @Autowired
    PitchingService pitchingService;

    @GetMapping(EndpointUrl.PITCHINGS)
    public ResponseEntity findAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){

        return ResponseEntity.ok(pitchingService.findAll(page, size));
    }

    @GetMapping(EndpointUrl.PITCHINGS_PLAYER)
    public ResponseEntity findByPlayerId(@PathVariable("playerId") String playerId){
        return ResponseEntity.ok(pitchingService.findById(playerId));
    }

    @GetMapping(EndpointUrl.PITCHINGS_SEARCH_TOP)
    public ResponseEntity findTop(@RequestParam(value = "top", defaultValue = "W", required = false) String top,
                                  @RequestParam(value = "size", defaultValue = "10", required = false) Integer size){

        return ResponseEntity.ok(pitchingService.findTop(size, top.toUpperCase()));
    }
}
