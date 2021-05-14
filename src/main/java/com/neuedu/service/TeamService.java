package com.neuedu.service;

import com.neuedu.entity.Team;
import com.neuedu.vo.findWestTopEightVO;

import java.util.List;

public interface TeamService {

    //获取东部排名前8的球队
    List<Team> getEastTopEight();

    //获取西部排名前8的球队
    List<Team> getWestTopEight();
}
