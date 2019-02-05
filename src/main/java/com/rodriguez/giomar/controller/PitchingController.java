package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.service.PitchingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "Pitching", description = "Pitching Endpoints")
public class PitchingController {
    @Autowired
    PitchingService pitchingService;

    @GetMapping(EndpointUrl.PITCHINGS)
    public ResponseEntity findAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){

        return ResponseEntity.ok(pitchingService.findAll(page, size));
    }

    @GetMapping(EndpointUrl.PITCHINGS_BY_PLAYER_ID)
    public ResponseEntity findByPlayerId(@PathVariable("playerId") String playerId,
                                         @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                         @RequestParam(value = "size", defaultValue = "20", required = false) Integer size){
        return ResponseEntity.ok(pitchingService.findById(playerId, page, size));
    }

    @GetMapping(EndpointUrl.PITCHINGS_SEARCH_TOP)
    public ResponseEntity findTop(@RequestParam(value = "top", defaultValue = "W", required = false) String top,
                                  @RequestParam(value = "size", defaultValue = "10", required = false) Integer size){

        return ResponseEntity.ok(pitchingService.findTop(size, top.toUpperCase()));
    }
}
