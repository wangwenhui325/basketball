package com.neuedu.controller;

import com.neuedu.common.ServerResponse;
import com.neuedu.entity.Player;
import com.neuedu.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    //现役球员列表
    @RequestMapping(value="/activePlayers")
    public ServerResponse activePlayers(){
        List<Player> activePlayersList = playerService.getActivePlayers();
        if (activePlayersList.size()>0) {
            return ServerResponse.success("查询现役球员成功").data("activePlayersList",activePlayersList);
        }else {
            return ServerResponse.error("没有任何现役球员信息");
        }
    }

    //退役球员列表
    @RequestMapping(value="/retiredPlayers")
    public ServerResponse retiredPlayers(){
        List<Player> retiredPlayersList = playerService.getRetiredPlayers();
        if (retiredPlayersList.size()>0) {
            return ServerResponse.success("查询退役球员成功").data("retiredPlayersList",retiredPlayersList);
        }else {
            return ServerResponse.error("没有任何退役球员信息");
        }
    }

    /*球员各数据排名前三*/
    @RequestMapping("/pointsTop")
    public ServerResponse pointsTop(){
        List<Player> pointsTopList = playerService.getPointsTop();
        if (pointsTopList.size()>0){
            return ServerResponse.success("成功").data("pointsTopList",pointsTopList);
        }else {
            return ServerResponse.error("失败");
        }

    }

    @RequestMapping("/reboundsTop")
    public ServerResponse reboundsTop(){
        List<Player> reboundsTopList = playerService.getReboundsTop();
        return ServerResponse.success("成功").data("reboundsTopList",reboundsTopList);
    }

    @RequestMapping("/assistsTop")
    public ServerResponse assistsTop(){
        List<Player> assistsTopList = playerService.getAssistsTop();
        return ServerResponse.success("成功").data("assistsTopList",assistsTopList);
    }

    @RequestMapping("/blocksTop")
    public ServerResponse blocksTop(){
        List<Player> blocksTopList = playerService.getBlocksTop();
        return ServerResponse.success("成功").data("blocksTopList",blocksTopList);
    }

    @RequestMapping("/stealsTop")
    public ServerResponse stealsTop(){
        List<Player> stealsTopList = playerService.getStealsTop();
        return ServerResponse.success("成功").data("stealsTopList",stealsTopList);
    }

    @RequestMapping("/turnoversTop")
    public ServerResponse turnoversTop(){
        List<Player> turnoversTopList = playerService.getTurnoversTop();
        return ServerResponse.success("成功").data("turnoversTopList",turnoversTopList);
    }
}
