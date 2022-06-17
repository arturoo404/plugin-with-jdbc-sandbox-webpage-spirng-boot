package com.arturoo404.MinecraftPage.service.impl;

import com.arturoo404.MinecraftPage.entity.enums.UserRole;
import com.arturoo404.MinecraftPage.entity.user.User;
import com.arturoo404.MinecraftPage.entity.user.dto.UserRegistrationDto;
import com.arturoo404.MinecraftPage.repository.UserRepository;
import com.arturoo404.MinecraftPage.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("We can not find this email"));
    }

    @Override
    public void registerUser(UserRegistrationDto userRegistrationDto) {
        //TODO Password equals, email valid

        userRepository.save(User.builder()
                .email(userRegistrationDto.getEmail())
                .nick(userRegistrationDto.getNick())
                .enabled(true)
                .userRole(UserRole.PLAYER)
                .password(new BCryptPasswordEncoder().encode(userRegistrationDto.getPassword()))
                .build());
    }
}
