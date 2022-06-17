package com.arturoo404.MinecraftPage.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PlayerOnlineDto {
    private String playerName;
    private boolean playerOnline;
}
