package com.neuedu.mapper;

import com.neuedu.entity.Player;

import java.util.List;

public interface PlayerMapper {
    int deleteByPrimaryKey(Integer playerId);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Integer playerId);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);

    //查询现役球员
    List<Player> findActivePlayers();

    //查询退役球员
    List<Player> findRetiredPlayers();

    /*
    * 球员排名
    * */
    //得分前3
    List<Player> findPointsTop();
    //篮板前3
    List<Player> findReboundsTop();
    //助攻前3
    List<Player> findAssistsTop();
    //盖帽前3
    List<Player> findBlocksTop();
    //抢断前3
    List<Player> findStealsTop();
    //失误前3
    List<Player> findTurnoversTop();

}