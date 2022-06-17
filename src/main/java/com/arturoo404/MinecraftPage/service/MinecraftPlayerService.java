package com.arturoo404.MinecraftPage.service;


import com.arturoo404.MinecraftPage.entity.dto.PlayerOnlineDto;

import java.util.List;

public interface MinecraftPlayerService {
    List<PlayerOnlineDto> getOnlinePlayers();
}
