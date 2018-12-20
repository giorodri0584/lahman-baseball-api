package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by giorod on 9/28/2017.
 */
@Entity
@Table(name = "master")
public class Player {
    @Id
    @JsonProperty(value = "playerID")
    private String playerID;
    @JsonProperty(value = "birthYear")
    private int birthYear;
    @JsonProperty(value = "birthMonth")
    private int birthMonth;
    @JsonProperty(value = "birthDay")
    private int birthDay;
    @JsonProperty(value = "birthCountry")
    private String birthCountry;
    @JsonProperty(value = "birthState")
    private String birthState;
    @JsonProperty(value = "birthCity")
    private String birthCity;
    @JsonProperty(value = "deathYear")
    private String deathYear;
    @JsonProperty(value = "deathMonth")
    private String deathMonth;
    @JsonProperty(value = "deathDay")
    private String deathDay;
    @JsonProperty(value = "deathCountry")
    private String deathCountry;
    @JsonProperty(value = "deathState")
    private String deathState;
    @JsonProperty(value = "deathCity")
    private String deathCity;
    @JsonProperty(value = "nameFirst")
    private String nameFirst;
    @JsonProperty(value = "nameLast")
    private String nameLast;
    @JsonProperty(value = "nameGiven")
    private String nameGiven;
    @JsonProperty(value = "weight")
    private int weight;
    @JsonProperty(value = "height")
    private int height;
    @JsonProperty(value = "bats")
    private String bats;
    @Column(name = "throws")
    @JsonProperty(value = "throwsHand")
    private String throwsHand;
    @JsonProperty(value = "debut")
    private String debut;
    @JsonProperty(value = "finalGame")
    private String finalGame;
    @JsonProperty(value = "retroID")
    private String retroID;
    @JsonProperty(value = "bbrefID")
    private String bbrefID;

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(String deathMonth) {
        this.deathMonth = deathMonth;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(String deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getThrowsHand() {
        return throwsHand;
    }

    public void setThrowsHand(String throwsHand) {
        this.throwsHand = throwsHand;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(String finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroID() {
        return retroID;
    }

    public void setRetroID(String retroID) {
        this.retroID = retroID;
    }

    public String getBbrefID() {
        return bbrefID;
    }

    public void setBbrefID(String bbrefID) {
        this.bbrefID = bbrefID;
    }
}
