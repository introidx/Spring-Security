package com.introidx.spring_security_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PRAKASH RANJAN on 14-01-2022
 */
@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "This is Homepage";
    }

    @GetMapping("/login")
    public String login(){
        return "This is Login";
    }

    @GetMapping("/register")
    public String register(){
        return "This is register";
    }
}
