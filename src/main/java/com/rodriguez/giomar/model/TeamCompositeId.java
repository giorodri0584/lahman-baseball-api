package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TeamCompositeId implements Serializable {
    @JsonProperty(value = "teamID")
    private String teamID;

    @JsonProperty(value = "yearID")
    private int yearID;

    public TeamCompositeId() {
    }

    public TeamCompositeId(String teamID, int yearID) {
        this.teamID = teamID;
        this.yearID = yearID;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
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
        TeamCompositeId that = (TeamCompositeId) o;
        return getYearID() == that.getYearID() &&
                Objects.equals(getTeamID(), that.getTeamID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeamID(), getYearID());
    }
}
