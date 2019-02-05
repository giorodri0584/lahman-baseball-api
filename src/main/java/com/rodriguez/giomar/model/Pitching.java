package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pitching")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@Getter
@Setter
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

}
