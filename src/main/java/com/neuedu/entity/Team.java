package com.neuedu.entity;

import lombok.Data;

@Data
public class Team {
    private Integer teamId;

    private String teamName;

    private String teamPhoto;

    private Integer win;

    private Integer lose;

    private Double shootingPercentage;

    private Double threePointPercentage;

    private Double freeThrowPercentage;

    private Double teamPoints;

    private Double teamRebounds;

    private Double teamAssists;

    private Double teamSteals;

    private Double teamBlocks;

    private Double teamTurnovers;

    private Double teamFouls;

    private String area;

    private Double differenceWins;

}