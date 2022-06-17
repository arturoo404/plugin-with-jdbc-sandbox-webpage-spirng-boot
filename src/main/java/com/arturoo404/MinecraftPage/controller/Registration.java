package com.arturoo404.MinecraftPage.controller;

import com.arturoo404.MinecraftPage.entity.user.dto.UserRegistrationDto;
import com.arturoo404.MinecraftPage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class Registration {

    private final UserService userService;

    public Registration(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String registrationPage(Model model){
        model.addAttribute("user", new UserRegistrationDto());

        return "registration/registration";
    }

    @PostMapping("/register")
    public String registerAccount(UserRegistrationDto userRegistrationDto){
        userService.registerUser(userRegistrationDto);
        return "redirect:/registration";
    }
}
