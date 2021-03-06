package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.configuration.EndpointUrl;
import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.service.PlayerService;
import fj.data.Either;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "Player", description = "Players Endpoints")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping(EndpointUrl.PLAYERS)
    @ApiOperation(value = "Retrieves All Players", response = Player.class)
    public ResponseEntity findAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){

        return ResponseEntity.ok(playerService.findAll(page, size));
    }
    @ApiOperation(value = "Retrieve player by playerID", response = Player.class)
    @GetMapping(EndpointUrl.PLAYERS_BY_PLAYER_ID)
    public ResponseEntity findOne(@PathVariable("playerID") String playerID){
        Player player = playerService.findOne(playerID);
        if(player != null){
            return ResponseEntity.ok(player);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @ApiOperation(value = "Search for player base on stats", response = Player.class)
    @GetMapping(EndpointUrl.PLAYERS_SEARCH)
    public ResponseEntity search(@RequestParam String[] query,
                                                      @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                                      @RequestParam(value = "size", defaultValue = "0", required = false) Integer size){

        Either<SearchError, Page<Player>> result = playerService.search(query, page, size);
        if(result.isRight()) {
            return ResponseEntity.ok().body(result.right().value());
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.left().value());
        }

    }
}
