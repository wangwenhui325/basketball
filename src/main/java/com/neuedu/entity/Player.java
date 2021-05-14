package com.neuedu.entity;

import lombok.Data;

@Data
public class Player {
    private Integer playerId;

    private String playerName;

    private String playerPhoto;

    private String teamName;

    private Integer number;

    private Integer position;

    private Double height;

    private Double weight;

    private Integer age;

    private Double playerPoints;

    private Double playerRebounds;

    private Double playerAssists;

    private Double playerSteals;

    private Double playerBlocks;

    private Double playerTurnovers;

    private Integer playerState;

}