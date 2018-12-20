package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by giorod on 9/6/2018.
 */
@Entity
@Table(name = "fielding")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Fielding {
    @JsonIgnore
    @EmbeddedId
    private CompositeId compositeId;

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
    private String teamID;

    @JsonProperty(value = "lgID")
    @Column(name = "lgID")
    private String lgID;

    @JsonProperty(value = "POS")
    @Column(name = "POS")
    private String POS;

    @JsonProperty(value = "G")
    @Column(name = "G")
    private int G;

    @JsonProperty(value = "GS")
    @Column(name = "GS")
    private String GS;

    @JsonProperty(value = "InnOuts")
    @Column(name = "InnOuts")
    private String InnOuts;

    @JsonProperty(value = "PO")
    @Column(name = "PO")
    private int PO;

    @JsonProperty(value = "A")
    @Column(name = "A")
    private int A;

    @JsonProperty(value = "E")
    @Column(name = "E")
    private int E;

    @JsonProperty(value = "DP")
    @Column(name = "DP")
    private int DP;

    @JsonProperty(value = "PB")
    @Column(name = "PB")
    private String PB;

    @JsonProperty(value = "WP")
    @Column(name = "WP")
    private String WP;

    @JsonProperty(value = "SB")
    @Column(name = "SB")
    private String SB;

    @JsonProperty(value = "CS")
    @Column(name = "CS")
    private String CS;

    @JsonProperty(value = "ZR")
    @Column(name = "ZR")
    private String ZR;

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

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public String getPOS() {
        return POS;
    }

    public void setPOS(String POS) {
        this.POS = POS;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    public String getInnOuts() {
        return InnOuts;
    }

    public void setInnOuts(String innOuts) {
        InnOuts = innOuts;
    }

    public int getPO() {
        return PO;
    }

    public void setPO(int PO) {
        this.PO = PO;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getE() {
        return E;
    }

    public void setE(int e) {
        E = e;
    }

    public int getDP() {
        return DP;
    }

    public void setDP(int DP) {
        this.DP = DP;
    }

    public String getPB() {
        return PB;
    }

    public void setPB(String PB) {
        this.PB = PB;
    }

    public String getWP() {
        return WP;
    }

    public void setWP(String WP) {
        this.WP = WP;
    }

    public String getSB() {
        return SB;
    }

    public void setSB(String SB) {
        this.SB = SB;
    }

    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        this.CS = CS;
    }

    public String getZR() {
        return ZR;
    }

    public void setZR(String ZR) {
        this.ZR = ZR;
    }
}
