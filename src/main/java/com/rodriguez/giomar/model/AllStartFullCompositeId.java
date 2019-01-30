package com.rodriguez.giomar.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class AllStartFullCompositeId implements Serializable {
    //Player ID code
    private String playerID;
    //Year
    private int YearID;
    //Game number (zero if only one All-Star game played that season)
    private int gameNum;
}
