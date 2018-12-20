package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by giorod on 10/3/2017.
 */
@Entity
@Table(name = "batting")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Batting {
    @EmbeddedId
    @JsonIgnore
    private CompositeId battingId;

    @JsonProperty(value = "playerID")
    @Column(name = "playerID", insertable = false, updatable = false)
    private String playerID;

    @Column(name = "yearID", insertable = false, updatable = false)
    @JsonProperty(value = "yearID")
    private int yearID;

    @Column(name = "stint", insertable = false, updatable = false)
    @JsonProperty(value = "stint")
    private int stint;

    @JsonProperty(value = "teamID")
    @Column(name = "teamID")
    private String teamId;

    @JsonProperty(value = "lgID")
    @Column(name = "lgID")
    private String lgID;

    @JsonProperty(value = "G")
    @Column(name = "G")
    private int G;

    @JsonProperty(value = "AB")
    @Column(name = "AB")
    private int AB;

    @JsonProperty(value = "R")
    @Column(name = "R")
    private int R;

    @JsonProperty(value = "H")
    @Column(name = "H")
    private int H;

    @JsonProperty(value = "2B")
    @Column(name = "2B")
    private int doubles;

    @Column(name = "3B")
    @JsonProperty(value = "3B")
    private int triples;

    @JsonProperty(value = "HR")
    @Column(name = "HR")
    private int HR;

    @JsonProperty(value = "RBI")
    @Column(name = "RBI")
    private int RBI;

    @JsonProperty(value = "SB")
    @Column(name = "SB")
    private int SB;

    @JsonProperty(value = "CS")
    @Column(name = "CS")
    private int CS;

    @JsonProperty(value = "BB")
    @Column(name = "BB")
    private int BB;

    @JsonProperty(value = "SO")
    @Column(name = "SO")
    private int SO;

    @JsonProperty(value = "IBB")
    @Column(name = "IBB")
    private String IBB;

    @JsonProperty(value = "HBP")
    @Column(name = "HBP")
    private String HBP;

    @JsonProperty(value = "SH")
    @Column(name = "SH")
    private String SH;

    @JsonProperty(value = "SF")
    @Column(name = "SF")
    private String SF;

    @JsonProperty(value = "GIDP")
    @Column(name = "GIDP")
    private String GIDP;

    @JsonIgnore
    @JoinColumn(name = "playerID", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    public int getStint() {
        return stint;
    }

    public void setStint(int stint) {
        this.stint = stint;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getAB() {
        return AB;
    }

    public void setAB(int AB) {
        this.AB = AB;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHR() {
        return HR;
    }

    public void setHR(int HR) {
        this.HR = HR;
    }

    public int getRBI() {
        return RBI;
    }

    public void setRBI(int RBI) {
        this.RBI = RBI;
    }

    public int getSB() {
        return SB;
    }

    public void setSB(int SB) {
        this.SB = SB;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public int getBB() {
        return BB;
    }

    public void setBB(int BB) {
        this.BB = BB;
    }

    public int getSO() {
        return SO;
    }

    public void setSO(int SO) {
        this.SO = SO;
    }

    public String getIBB() {
        return IBB;
    }

    public void setIBB(String IBB) {
        this.IBB = IBB;
    }

    public String getHBP() {
        return HBP;
    }

    public void setHBP(String HBP) {
        this.HBP = HBP;
    }

    public String getSH() {
        return SH;
    }

    public void setSH(String SH) {
        this.SH = SH;
    }

    public String getSF() {
        return SF;
    }

    public void setSF(String SF) {
        this.SF = SF;
    }

    public String getGIDP() {
        return GIDP;
    }

    public void setGIDP(String GIDP) {
        this.GIDP = GIDP;
    }
}
