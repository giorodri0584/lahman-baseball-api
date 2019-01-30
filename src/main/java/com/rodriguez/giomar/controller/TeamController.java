package com.rodriguez.giomar.controller;

import com.rodriguez.giomar.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/teams")
    public ResponseEntity findAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                  @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        return ResponseEntity.ok(teamService.findAll(page, size));
    }

    @GetMapping("/{teamId}/teams")
    public ResponseEntity findByTeamId(@PathVariable("teamId") String teamId){
        return ResponseEntity.ok(teamService.findByTeamId(teamId));
    }
}

