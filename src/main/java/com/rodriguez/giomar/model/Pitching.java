package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by giorod on 8/22/2018.
 */
@Entity
@Table(name = "pitching")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Pitching {
    @EmbeddedId
    @JsonIgnore
    private CompositeId pitchingId;

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

    @JsonProperty(value = "W")
    @Column(name = "W")
    private int W;

    @JsonProperty(value = "L")
    @Column(name = "L")
    private int L;

    @JsonProperty(value = "G")
    @Column(name = "G")
    private int G;

    @JsonProperty(value = "GS")
    @Column(name = "GS")
    private int GS;

    @JsonProperty(value = "CG")
    @Column(name = "CG")
    private int CG;

    @JsonProperty(value = "SHO")
    @Column(name = "SHO")
    private int SHO;

    @JsonProperty(value = "SV")
    @Column(name = "SV")
    private int SV;

    @JsonProperty(value = "IPOuts")
    @Column(name = "IPOuts")
    private int IPOuts; //innings pitched x 3

    @JsonProperty(value = "H")
    @Column(name = "H")
    private int H;

    @JsonProperty(value = "ER")
    @Column(name = "ER")
    private int ER;

    @JsonProperty(value = "HR")
    @Column(name = "HR")
    private int HR;

    @JsonProperty(value = "BB")
    @Column(name = "BB")
    private int BB;

    @JsonProperty(value = "SO")
    @Column(name = "SO")
    private int SO;

    @JsonProperty(value = "BAOpp")
    @Column(name = "BAOpp")
    private String BAOpp;

    @JsonProperty(value = "ERA")
    @Column(name = "ERA")
    private float ERA;

    @JsonProperty(value = "IBB")
    @Column(name = "IBB")
    private String IBB;

    @JsonProperty(value = "WP")
    @Column(name = "WP")
    private String WP;

    @JsonProperty(value = "HBP")
    @Column(name = "HBP")
    private String HBP;

    @JsonProperty(value = "BK")
    @Column(name = "BK")
    private int BK;

    @JsonProperty(value = "BFP")
    @Column(name = "BFP")
    private String BFP;

    @JsonProperty(value = "GF")
    @Column(name = "GF")
    private String GF;

    @JsonProperty(value = "R")
    @Column(name = "R")
    private int R;

    @JsonProperty(value = "SH")
    @Column(name = "SH")
    private String SH;

    @JsonProperty(value = "SF")
    @Column(name = "SF")
    private String SF;

    @JsonProperty(value = "GIDP")
    @Column(name = "GIDP")
    private String GIDP;

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

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getGS() {
        return GS;
    }

    public void setGS(int GS) {
        this.GS = GS;
    }

    public int getCG() {
        return CG;
    }

    public void setCG(int CG) {
        this.CG = CG;
    }

    public int getSHO() {
        return SHO;
    }

    public void setSHO(int SHO) {
        this.SHO = SHO;
    }

    public int getSV() {
        return SV;
    }

    public void setSV(int SV) {
        this.SV = SV;
    }

    public int getIPOuts() {
        return IPOuts;
    }

    public void setIPOuts(int IPOuts) {
        this.IPOuts = IPOuts;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public int getER() {
        return ER;
    }

    public void setER(int ER) {
        this.ER = ER;
    }

    public int getHR() {
        return HR;
    }

    public void setHR(int HR) {
        this.HR = HR;
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

    public String getBAOpp() {
        return BAOpp;
    }

    public void setBAOpp(String BAOpp) {
        this.BAOpp = BAOpp;
    }

    public float getERA() {
        return ERA;
    }

    public void setERA(float ERA) {
        this.ERA = ERA;
    }

    public String getIBB() {
        return IBB;
    }

    public void setIBB(String IBB) {
        this.IBB = IBB;
    }

    public String getWP() {
        return WP;
    }

    public void setWP(String WP) {
        this.WP = WP;
    }

    public String getHBP() {
        return HBP;
    }

    public void setHBP(String HBP) {
        this.HBP = HBP;
    }

    public int getBK() {
        return BK;
    }

    public void setBK(int BK) {
        this.BK = BK;
    }

    public String getBFP() {
        return BFP;
    }

    public void setBFP(String BFP) {
        this.BFP = BFP;
    }

    public String getGF() {
        return GF;
    }

    public void setGF(String GF) {
        this.GF = GF;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
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
