package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.service.PlayerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by giorod on 10/3/2017.
 */
@RestController
@Api(tags = "Player", description = "Players Endpoints")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping(EndpointUrl.PLAYERS)
    @ApiOperation(value = "Retrieves All Players")
    public ResponseEntity<?> findAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){

        return ResponseEntity.ok(playerService.findAll(page, size));
    }
    @GetMapping(EndpointUrl.PLAYERS_PLAYERID)
    public ResponseEntity<?> findOne(@PathVariable("playerID") String playerID){
        Player player = playerService.findOne(playerID);
        if(player != null){
            return ResponseEntity.ok(player);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @GetMapping(EndpointUrl.PLAYER_SEARCH)
    public ResponseEntity search(@RequestParam(value = "search") String search,
                                 @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                 @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        return ResponseEntity.ok(playerService.search(search, page, size));
    }
}
