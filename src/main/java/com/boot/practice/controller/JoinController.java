package com.boot.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    @GetMapping("/")
    public String login(){
        return "login";
    }
    @GetMapping("/join/joinPage")
    public String joinPage(){
        return "join/joinPage";
    }

}
