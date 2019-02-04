package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.service.BattingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by giorod on 10/3/2017.
 */
@RestController
@Api(tags = "Batting", description = "Batting Endpoints")
@RequestMapping("/api")
public class BattingController {
    @Autowired
    BattingService battingService;

    @GetMapping(EndpointUrl.BATTINGS_PLAYER)
    public ResponseEntity<?> findAll(@PathVariable("playerID") String playerID,
                                     @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                     @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        return ResponseEntity.ok(battingService.findAll(playerID, page, size));
    }

    @GetMapping(EndpointUrl.BATTINGS_SEARCH_TOP)
    public ResponseEntity findTop(@RequestParam(value = "top", required = false, defaultValue = "HR") String top,
                                  @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        top.toUpperCase();
        if(top.equals("2b") || top.equals("2B")){
            top = "doubles";
        }
        if (top.equals("3b") || top.equals("3B")){
            top = "triples";
        }
        return ResponseEntity.ok().body(battingService.findTop(size, top));
    }
    @GetMapping("/battings")
    public ResponseEntity findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                  @RequestParam(value = "size", defaultValue = "10", required = false) Integer size){
        return ResponseEntity.ok().body(battingService.findAll(page, size));
    }

    @GetMapping("/battings/search")
    public ResponseEntity search(@RequestParam String[] query,
                                 @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                 @RequestParam(value = "size", defaultValue = "10", required = false) Integer size){
        return ResponseEntity.ok(battingService.search(query, page, size).right().value());
    }

}
