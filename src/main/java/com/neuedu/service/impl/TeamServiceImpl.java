package com.neuedu.service.impl;

import com.neuedu.entity.Team;
import com.neuedu.mapper.TeamMapper;
import com.neuedu.service.TeamService;
import com.neuedu.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> getEastTopEight() {
        return teamMapper.findEastTopEight();
    }

    @Override
    public List<Team> getWestTopEight() {
        return teamMapper.findWestTopEight();
    }
}
