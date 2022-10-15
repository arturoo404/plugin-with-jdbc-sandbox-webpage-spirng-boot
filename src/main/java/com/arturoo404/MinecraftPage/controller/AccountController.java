package com.arturoo404.MinecraftPage.controller;

import com.arturoo404.MinecraftPage.entity.user.dto.UserInfoDto;
import com.arturoo404.MinecraftPage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/account")
public class AccountController {

    private final UserService userService;

    public AccountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String accountInfo(@RequestParam(name = "email") String email,
                              Model model){
        UserInfoDto userInfoDto = userService.findAccountInfo(email);
        model.addAttribute("user", userInfoDto);
        return "account/account_info";
    }
}
