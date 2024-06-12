package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/auth/login")
    public String login(){
        return "/auth/login";
    }

    @GetMapping("/auth/idInquiry")
    public String idInquiry(){
        return "/auth/idInquiry";
    }

    @GetMapping("/auth/pwInquiry")
    public String pwInquiry(){
        return "/auth/pwInquiry";
    }

    @GetMapping("/auth/join")
    public String join(){
        return "/auth/join";
    }
}
