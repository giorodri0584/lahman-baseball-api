package com.rodriguez.giomar.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by giorod on 10/3/2017.
 */
@Entity
@Table(name = "batting")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@Getter
@Setter
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

}
