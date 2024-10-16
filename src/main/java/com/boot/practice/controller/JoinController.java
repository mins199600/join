package com.boot.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/join")
public class JoinController {
    @GetMapping("/")
    public String login(){
        return "login";
    }
    @GetMapping("/joinPage")
    public String joinPage(){
        return "join/joinPage";
    }
}
