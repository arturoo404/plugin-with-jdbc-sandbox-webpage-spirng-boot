package com.arturoo404.MinecraftPage.controller;


import com.arturoo404.MinecraftPage.entity.minecraftplayer.dto.PlayerOnlineDto;
import com.arturoo404.MinecraftPage.service.MinecraftPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class MinecraftPlayerController {

    private final MinecraftPlayerService playerService;

    @Autowired
    public MinecraftPlayerController(MinecraftPlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping()
    public String getOnlineUser(Model model){
        List<PlayerOnlineDto> players = playerService.getOnlinePlayers();
        model.addAttribute("players", players);

        return "admin/players_online";
    }
}
