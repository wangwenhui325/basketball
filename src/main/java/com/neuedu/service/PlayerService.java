package com.neuedu.service;

import com.neuedu.entity.Player;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlayerService {
    //查询现役球员
    List<Player> getActivePlayers();

    //查询退役球员
    List<Player> getRetiredPlayers();

    //得分前3
    List<Player> getPointsTop();
    //篮板前3
    List<Player> getReboundsTop();
    //助攻前3
    List<Player> getAssistsTop();
    //盖帽前3
    List<Player> getBlocksTop();
    //抢断前3
    List<Player> getStealsTop();
    //失误前3
    List<Player> getTurnoversTop();

}
