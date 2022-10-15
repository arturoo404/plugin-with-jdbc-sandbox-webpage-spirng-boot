package com.arturoo404.MinecraftPage.service;

import com.arturoo404.MinecraftPage.entity.user.dto.UserInfoDto;
import com.arturoo404.MinecraftPage.entity.user.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    void registerUser(UserRegistrationDto userRegistrationDto);

    UserInfoDto findAccountInfo(String email);
}
