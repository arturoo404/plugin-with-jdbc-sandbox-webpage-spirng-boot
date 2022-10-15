package com.arturoo404.MinecraftPage.service.impl;

import com.arturoo404.MinecraftPage.entity.minecraftplayer.MinecraftPlayer;
import com.arturoo404.MinecraftPage.entity.minecraftplayer.dto.PlayerOnlineDto;
import com.arturoo404.MinecraftPage.repository.PlayerRepository;
import com.arturoo404.MinecraftPage.service.MinecraftPlayerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MinecraftPlayerImpl implements MinecraftPlayerService {

    private final PlayerRepository playerRepository;

    public MinecraftPlayerImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<PlayerOnlineDto> getOnlinePlayers() {
        List<MinecraftPlayer> minecraftPlayers = playerRepository.findAll();
        return minecraftPlayers.stream()
                .map(m -> new PlayerOnlineDto(
                        m.getPlayerName(),
                        m.isPlayerOnline()
                ))
                .collect(Collectors.toList());
    }
}
