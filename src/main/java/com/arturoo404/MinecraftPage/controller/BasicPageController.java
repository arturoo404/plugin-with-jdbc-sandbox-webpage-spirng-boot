package com.arturoo404.MinecraftPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicPageController {

    @GetMapping(path = "/login")
    public String loginPage(){
        return "basic/login_page";
    }
}
