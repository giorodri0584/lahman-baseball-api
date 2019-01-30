package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
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
}
