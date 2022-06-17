package com.arturoo404.MinecraftPage.entity.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDto {

    private String nick;
    private String email;
    private String password;
    private String confirmPassword;
}
