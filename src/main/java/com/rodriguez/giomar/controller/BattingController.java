package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.service.BattingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "Batting", description = "Batting Endpoints")
public class BattingController {
    @Autowired
    BattingService battingService;

    @GetMapping(EndpointUrl.BATTINGS_BY_PLAYER_ID)
    public ResponseEntity<?> findAll(@PathVariable("playerID") String playerID,
                                     @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                     @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        return ResponseEntity.ok(battingService.findAll(playerID, page, size));
    }

    @GetMapping(EndpointUrl.BATTINGS_SEARCH_TOP)
    public ResponseEntity findTop(@RequestParam(value = "top", required = false, defaultValue = "HR") String top,
                                  @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        return ResponseEntity.ok().body(battingService.findTop(size, top));
    }
    @GetMapping(EndpointUrl.BATTINGS)
    public ResponseEntity findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                  @RequestParam(value = "size", defaultValue = "10", required = false) Integer size){
        return ResponseEntity.ok().body(battingService.findAll(page, size));
    }

    @GetMapping(EndpointUrl.BATTINGS_SEARCH)
    public ResponseEntity search(@RequestParam String[] query,
                                 @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                 @RequestParam(value = "size", defaultValue = "10", required = false) Integer size){
        return ResponseEntity.ok(battingService.search(query, page, size).right().value());
    }

}
