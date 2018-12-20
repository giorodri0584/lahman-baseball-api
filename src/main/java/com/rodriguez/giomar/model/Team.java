package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Team {
    @Id
    @JsonProperty(value = "teamID")
    private String teamID;

    @JsonProperty(value = "yearID")
    private int yearID;

    @JsonProperty(value = "lgID")
    private String lgID;

    @JsonProperty(value = "franchID")
    private String franchID;

    @JsonProperty(value = "divID")
    private String divID;

    @JsonProperty(value = "Rank")
    private int Rank;

    @JsonProperty(value = "G")
    private int G;

    @JsonProperty(value = "GHome")
    private String GHome;

    @JsonProperty(value = "W")
    private int W;

    @JsonProperty(value = "L")
    private int L;

    @JsonProperty(value = "DivWin")
    private String DivWin;

    @JsonProperty(value = "WCWin")
    private String WCWin;

    @JsonProperty(value = "LgWin")
    private String LgWin;

    @JsonProperty(value = "WSWin")
    private String WSWin;

    @JsonProperty(value = "R")
    private int R;

    @JsonProperty(value = "AB")
    private int AB;

    @JsonProperty(value = "H")
    private int H;

    @Column(name = "2B")
    @JsonProperty(value = "2B")
    private int doubles;

    @Column(name = "3B")
    @JsonProperty(value = "3B")
    private int triples;

    @JsonProperty(value = "HR")
    private int HR;

    @JsonProperty(value = "BB")
    private int BB;

    @JsonProperty(value = "SO")
    private int SO;

    @JsonProperty(value = "SB")
    private int SB;

    @JsonProperty(value = "CS")
    private String CS;

    @JsonProperty(value = "HBP")
    private String HBP;

    @JsonProperty(value = "SF")
    private String SF;

    @JsonProperty(value = "RA")
    private int RA;

    @JsonProperty(value = "ER")
    private int ER;

    @JsonProperty(value = "ERA")
    private float ERA;

    @JsonProperty(value = "CG")
    private int CG;

    @JsonProperty(value = "SHO")
    private int SHO;

    @JsonProperty(value = "SV")
    private int SV;

    @JsonProperty(value = "IPOuts")
    private int IPOuts;

    @JsonProperty(value = "HA")
    private int HA;

    @JsonProperty(value = "HRA")
    private int HRA;

    @JsonProperty(value = "BBA")
    private int BBA;

    @JsonProperty(value = "SOA")
    private int SOA;

    @JsonProperty(value = "E")
    private int E;

    @JsonProperty(value = "DP")
    private String DP;

    @JsonProperty(value = "FP")
    private float FP;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "park")
    private String park;

    @JsonProperty(value = "attendance")
    private String attendance;

    @JsonProperty(value = "BPF")
    private int BPF;

    @JsonProperty(value = "PPF")
    private int PPF;

    @JsonProperty(value = "teamIDBR")
    private String teamIDBR;

    @JsonProperty(value = "teamIDlahman45")
    private String teamIDlahman45;

    @JsonProperty(value = "teamIDretro")
    private String teamIDretro;

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

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public String getFranchID() {
        return franchID;
    }

    public void setFranchID(String franchID) {
        this.franchID = franchID;
    }

    public String getDivID() {
        return divID;
    }

    public void setDivID(String divID) {
        this.divID = divID;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public String getGHome() {
        return GHome;
    }

    public void setGHome(String GHome) {
        this.GHome = GHome;
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

    public String getDivWin() {
        return DivWin;
    }

    public void setDivWin(String divWin) {
        DivWin = divWin;
    }

    public String getWCWin() {
        return WCWin;
    }

    public void setWCWin(String WCWin) {
        this.WCWin = WCWin;
    }

    public String getLgWin() {
        return LgWin;
    }

    public void setLgWin(String lgWin) {
        LgWin = lgWin;
    }

    public String getWSWin() {
        return WSWin;
    }

    public void setWSWin(String WSWin) {
        this.WSWin = WSWin;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getAB() {
        return AB;
    }

    public void setAB(int AB) {
        this.AB = AB;
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

    public int getSB() {
        return SB;
    }

    public void setSB(int SB) {
        this.SB = SB;
    }

    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        this.CS = CS;
    }

    public String getHBP() {
        return HBP;
    }

    public void setHBP(String HBP) {
        this.HBP = HBP;
    }

    public String getSF() {
        return SF;
    }

    public void setSF(String SF) {
        this.SF = SF;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public int getER() {
        return ER;
    }

    public void setER(int ER) {
        this.ER = ER;
    }

    public float getERA() {
        return ERA;
    }

    public void setERA(float ERA) {
        this.ERA = ERA;
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

    public int getHA() {
        return HA;
    }

    public void setHA(int HA) {
        this.HA = HA;
    }

    public int getHRA() {
        return HRA;
    }

    public void setHRA(int HRA) {
        this.HRA = HRA;
    }

    public int getBBA() {
        return BBA;
    }

    public void setBBA(int BBA) {
        this.BBA = BBA;
    }

    public int getSOA() {
        return SOA;
    }

    public void setSOA(int SOA) {
        this.SOA = SOA;
    }

    public int getE() {
        return E;
    }

    public void setE(int e) {
        E = e;
    }

    public String getDP() {
        return DP;
    }

    public void setDP(String DP) {
        this.DP = DP;
    }

    public float getFP() {
        return FP;
    }

    public void setFP(float FP) {
        this.FP = FP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public int getBPF() {
        return BPF;
    }

    public void setBPF(int BPF) {
        this.BPF = BPF;
    }

    public int getPPF() {
        return PPF;
    }

    public void setPPF(int PPF) {
        this.PPF = PPF;
    }

    public String getTeamIDBR() {
        return teamIDBR;
    }

    public void setTeamIDBR(String teamIDBR) {
        this.teamIDBR = teamIDBR;
    }

    public String getTeamIDlahman45() {
        return teamIDlahman45;
    }

    public void setTeamIDlahman45(String teamIDlahman45) {
        this.teamIDlahman45 = teamIDlahman45;
    }

    public String getTeamIDretro() {
        return teamIDretro;
    }

    public void setTeamIDretro(String teamIDretro) {
        this.teamIDretro = teamIDretro;
    }
}
