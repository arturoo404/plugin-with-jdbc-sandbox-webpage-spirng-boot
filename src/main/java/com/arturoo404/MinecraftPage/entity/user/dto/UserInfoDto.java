package com.arturoo404.MinecraftPage.entity.user.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {

    private String playerName;
    private boolean playerOnline;
    private String nick;
    private Long money;

}
