package com.neuedu.service.impl;

import com.neuedu.entity.Player;
import com.neuedu.mapper.PlayerMapper;
import com.neuedu.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;
    @Override
    public List<Player> getActivePlayers() {
        return playerMapper.findActivePlayers();
    }

    @Override
    public List<Player> getRetiredPlayers() {
        return playerMapper.findRetiredPlayers();
    }

    @Override
    public List<Player> getPointsTop() {
        return playerMapper.findPointsTop();
    }

    @Override
    public List<Player> getReboundsTop() {
        return playerMapper.findReboundsTop();
    }

    @Override
    public List<Player> getAssistsTop() {
        return playerMapper.findAssistsTop();
    }

    @Override
    public List<Player> getBlocksTop() {
        return playerMapper.findBlocksTop();
    }

    @Override
    public List<Player> getStealsTop() {
        return playerMapper.findStealsTop();
    }

    @Override
    public List<Player> getTurnoversTop() {
        return playerMapper.findTurnoversTop();
    }
}
