package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "allstarfull")
@Getter
@Setter
public class AllStarFull {
    @JsonIgnore
    @EmbeddedId
    private AllStartFullCompositeId compositeId;
    //Player ID code
    @Column(name = "playerID", updatable = false, insertable = false)
    private String playerID;
    //Year
    @Column(name = "yearID", updatable = false, insertable = false)
    private int YearID;
    //Game number (zero if only one All-Star game played that season)
    @Column(name = "gameNum", updatable = false, insertable = false)
    private int gameNum;
    //Retrosheet ID for the game idea
    private String gameID;
    //Team
    private String teamID;
    //League
    private String lgID;
    //1 if Played in the game
    private int GP;
    //If player was game starter, the position played
    private String startingPos;
}
