package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by giorod on 11/8/2017.
 */
@Embeddable
public class CompositeId implements Serializable{
    @JsonProperty(value = "playerID")
    @Column(name = "playerID")
    private String playerID;
    @Column(name = "yearID")
    @JsonProperty(value = "yearID")
    private int yearID;
    @Column(name = "stint")
    @JsonProperty(value = "stint")
    private int stint;

    public CompositeId() {}
    public CompositeId(String playerID, int yearID, int stint) {
        this.playerID = playerID;
        this.yearID = yearID;
        this.stint = stint;
    }

    public int getStint() {
        return stint;
    }

    public void setStint(int stint) {
        this.stint = stint;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getYearID() {
        return yearID;
    }

    public void setYearID(int yearID) {
        this.yearID = yearID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositeId battingId = (CompositeId) o;

        if (getYearID() != battingId.getYearID()) return false;
        if (getStint() != battingId.getStint()) return false;
        return getPlayerID() != null ? getPlayerID().equals(battingId.getPlayerID()) : battingId.getPlayerID() == null;
    }

    @Override
    public int hashCode() {
        int result = getPlayerID() != null ? getPlayerID().hashCode() : 0;
        result = 31 * result + getYearID();
        result = 31 * result + getStint();
        return result;
    }
}
