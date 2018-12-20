package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.service.BattingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by giorod on 10/3/2017.
 */
@RestController
@Api(tags = "Batting", description = "Batting Endpoints")
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

}
