package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "master")
@Getter
@Setter
public class Player {
    @Id
    @JsonProperty(value = "playerID")
    @ApiModelProperty(notes = "A unique code asssigned to each player.")
    private String playerID;

    @JsonProperty(value = "birthYear")
    @ApiModelProperty(notes = "Year player was born")
    private int birthYear;

    @JsonProperty(value = "birthMonth")
    @ApiModelProperty(notes ="Month player was born")
    private int birthMonth;

    @JsonProperty(value = "birthDay")
    @ApiModelProperty(notes = "Day player was born")
    private int birthDay;

    @JsonProperty(value = "birthCountry")
    @ApiModelProperty(notes = "Country where player was born")
    private String birthCountry;

    @JsonProperty(value = "birthState")
    @ApiModelProperty(notes = "State where player was born")
    private String birthState;

    @JsonProperty(value = "birthCity")
    @ApiModelProperty(notes = "City where player was born")
    private String birthCity;

    @JsonProperty(value = "deathYear")
    @ApiModelProperty(notes = "Year player died")
    private String deathYear;

    @JsonProperty(value = "deathMonth")
    @ApiModelProperty(notes = "Month player died")
    private String deathMonth;

    @JsonProperty(value = "deathDay")
    @ApiModelProperty(notes = "Day player died")
    private String deathDay;

    @JsonProperty(value = "deathCountry")
    @ApiModelProperty(notes = "Country where player died")
    private String deathCountry;

    @JsonProperty(value = "deathState")
    @ApiModelProperty(notes ="State where player died")
    private String deathState;

    @JsonProperty(value = "deathCity")
    @ApiModelProperty(notes = "City where player died")
    private String deathCity;

    @JsonProperty(value = "nameFirst")
    @ApiModelProperty(notes = "Player's first name")
    private String nameFirst;

    @JsonProperty(value = "nameLast")
    @ApiModelProperty(notes = "Player's last name")
    private String nameLast;

    @JsonProperty(value = "nameGiven")
    @ApiModelProperty(notes ="Player's given name (typically first and middle)")
    private String nameGiven;

    @JsonProperty(value = "weight")
    @ApiModelProperty(notes = "Player's weight in pounds")
    private int weight;

    @JsonProperty(value = "height")
    @ApiModelProperty(notes = "Player's height in inches")
    private int height;

    @JsonProperty(value = "bats")
    @ApiModelProperty(notes = "Player's batting hand (left, right, or both)")
    private String bats;

    @Column(name = "throws")
    @JsonProperty(value = "throwsHand")
    @ApiModelProperty(notes ="Player's throwing hand (left or right)")
    private String throwsHand;

    @JsonProperty(value = "debut")
    @ApiModelProperty(notes = "Date that player made first major league appearance")
    private String debut;

    @JsonProperty(value = "finalGame")
    @ApiModelProperty(notes = "Date that player made first major league appearance (blank if still active)")
    private String finalGame;

    @JsonProperty(value = "retroID")
    @ApiModelProperty(notes = "ID used by retrosheet")
    private String retroID;

    @JsonProperty(value = "bbrefID")
    @ApiModelProperty(notes = "ID used by Baseball Reference website")
    private String bbrefID;

    @OneToMany
    @JoinColumn(name = "playerID")
    @ApiModelProperty(dataType = "[com.rodriguez.giomar.model.Batting]")
    @JsonIgnore
    private List<Batting> battings;

}
