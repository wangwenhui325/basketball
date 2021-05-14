package com.neuedu.controller;

import com.neuedu.common.ServerResponse;
import com.neuedu.entity.Team;
import com.neuedu.mapper.TeamMapper;
import com.neuedu.service.TeamService;
import com.neuedu.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    //东部前八球队
    @RequestMapping("/eastTopEight")
    public ServerResponse eastTopEight(){
        List<Team> eastTopEightList = teamService.getEastTopEight();
        if (eastTopEightList.size() > 0){
            return ServerResponse.success("东部前八球队获取成功").data("eastTopEightList",eastTopEightList);
        }else {
            return ServerResponse.error("暂无东部前八球队信息");
        }
    }


    //西部前八球队
    @RequestMapping("/westTopEight")
    public ServerResponse westTopEight(){
        List<Team> westTopEightList = teamService.getWestTopEight();

        if (westTopEightList.size() > 0){
            return ServerResponse.success("西部前八球队获取成功").data("westTopEightList",westTopEightList);
        }else {
            return ServerResponse.error("暂无西部前八球队信息");
        }
    }
}
