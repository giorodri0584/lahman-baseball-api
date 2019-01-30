package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Team {
    @JsonIgnore
    @EmbeddedId
    TeamCompositeId teamCompositeId;

    @JsonProperty(value = "teamID")
    @Column(name = "teamID", insertable = false, updatable = false)
    private String teamID;

    @JsonProperty(value = "yearID")
    @Column(name = "yearID", insertable = false, updatable = false)
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

}
