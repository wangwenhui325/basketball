package com.neuedu.mapper;

import com.neuedu.entity.Team;
import com.neuedu.vo.findWestTopEightVO;

import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer teamId);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer teamId);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    //查询东部排名前8的球队
    List<Team> findEastTopEight();

    //查询西部排名前8的球队
    List<Team> findWestTopEight();

}